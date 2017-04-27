package com.example.eduardocucharro.reediteye;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.provider.Settings;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.details.PostDetailsActivity;
import com.example.eduardocucharro.reediteye.feed.FeedAdapter;
import com.example.eduardocucharro.reediteye.feed.FeedPresenter;
import com.example.eduardocucharro.reediteye.feed.FeedView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.support.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION;

public class MainActivity extends AppCompatActivity implements
        FeedView,
        FeedAdapter.PostClickListener,
        FeedAdapter.BrowseClickListener,
        FeedAdapter.CommentsClickListener,
        SwipeRefreshLayout.OnRefreshListener {

    private static final String REEDIT_URL = "https://www.reddit.com";

    @BindView(R.id.swipe_refresh_main)
    SwipeRefreshLayout swipeRefreshLayout;

    @BindView(R.id.recycler_main)
    RecyclerView recyclerView;

    private FeedAdapter adapter;
    private AlertDialog enableNetworkDialog;
    private FeedPresenter presenter;
    private boolean pagingEnabled;
    private AlertDialog tryAgainDialog;
    private BroadcastReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        presenter = Injector.provideFeedPresenter(this);

        setupRecycler();

        setupConnectivityReceiver();
    }

    private void setupConnectivityReceiver() {
        receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

                if(isNetworksEnabled() && enableNetworkDialog != null) {
                    enableNetworkDialog.dismiss();
                    presenter.presentFeed();
                }
            }
        };
    }

    @Override
    protected void onStart() {
        super.onStart();

        IntentFilter filter = new IntentFilter();
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(receiver, filter);

        presenter.presentFeed();
    }

    @Override
    protected void onStop() {
        unregisterReceiver(receiver);
        presenter.stop();
        super.onStop();
    }

    private void setupRecycler() {
        adapter = new FeedAdapter(this);
        adapter.addPostClickListener(this);
        adapter.addBrowseClickListener(this);
        adapter.addCommentsClickListener(this);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                int itensOnAdapter = recyclerView.getLayoutManager().getItemCount();

                int firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();

                if (firstVisibleItemPosition >= (itensOnAdapter - 10)) {
                    presenter.presentMore();
                }
            }
        });

        swipeRefreshLayout.setOnRefreshListener(this);
    }

    @Override
    public void onRefresh() {
        presenter.refresh();
    }

    @Override
    public boolean isNetworksEnabled() {
        ConnectivityManager connectivityManager =
                (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);

        NetworkInfo mobile = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        return (mobile != null && mobile.isConnected()) ||
                (wifi != null && wifi.isConnected());
    }

    @Override
    public void showEnableNetworksDialog() {

        if(enableNetworkDialog == null) {
            enableNetworkDialog = new AlertDialog.Builder(this)
                    .setTitle(getString(R.string.network_required))
                    .setMessage(getString(R.string.internet_access_is_required_))
                    .setCancelable(false)
                    .setPositiveButton(getString(R.string.enable_internet), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            Intent intent = new Intent(Settings.ACTION_SETTINGS);
                            startActivity(intent);
                        }
                    })
                    .create();
        }

        enableNetworkDialog.show();
    }

    @Override
    public void showPost(Post post) {
        adapter.addPost(post);
    }

    @Override
    public void showProgress() {
        swipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideProgress() {
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void showPostDetails(Post post) {

        Intent intent = PostDetailsActivity.createIntent(this, post);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//
//            int position = adapter.getPostPosition(post);
//
//            RecyclerView.ViewHolder viewHolder = recyclerView.findViewHolderForAdapterPosition(position);
//
//            View titleView = viewHolder.itemView.findViewById(R.id.text_title_post);
//
//            Pair<View, String> titlePair = Pair.create(titleView, getString(R.string.posted_title));
//
//            Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(this, titlePair).toBundle();
//
//            startActivity(intent, bundle);
//
//            return;
//        }

        startActivity(intent);
    }

    @Override
    public Post getTailPost() {
        return adapter.getTailPost();
    }

    @Override
    public void browseUrl(Post post) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(post.getUrl()));
        startActivity(intent);
    }

    @Override
    public void browseOnCustom(Post post) {
        CustomTabsIntent intent = new CustomTabsIntent.Builder()
                .setToolbarColor(getResources().getColor(R.color.colorPrimary))
                .setCloseButtonIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_arrow_back_white_24dp))
                .enableUrlBarHiding()
                .setStartAnimations(this, android.R.anim.fade_in, android.R.anim.slide_out_right)
                .setExitAnimations(this, android.R.anim.fade_in, android.R.anim.slide_out_right)
                .build();

        intent.launchUrl(this, Uri.parse(post.getUrl()));
    }

    @Override
    public boolean supportsCustom() {
        return !getCustomTabsPackages().isEmpty();
    }

    public ArrayList getCustomTabsPackages() {

        PackageManager pm = getPackageManager();

        Intent activityIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(REEDIT_URL));

        List<ResolveInfo> resolvedActivityList = pm.queryIntentActivities(activityIntent, 0);

        ArrayList packagesSupportingCustomTabs = new ArrayList<>();

        for (ResolveInfo info : resolvedActivityList) {

            Intent serviceIntent = new Intent();
            serviceIntent.setAction(ACTION_CUSTOM_TABS_CONNECTION);
            serviceIntent.setPackage(info.activityInfo.packageName);

            if (pm.resolveService(serviceIntent, 0) != null) {
                packagesSupportingCustomTabs.add(info);
            }
        }
        return packagesSupportingCustomTabs;
    }

    @Override
    public boolean isPagingEnabled() {
        return pagingEnabled;
    }

    @Override
    public void setPagingEnabled(boolean b) {
        pagingEnabled = b;
    }

    @Override
    public boolean hasItems() {
        return adapter.totalItems() > 0;
    }

    @Override
    public void showTryAgainDialog() {
        if(tryAgainDialog == null) {
           tryAgainDialog = new AlertDialog.Builder(this)
                   .setCancelable(false)
                   .setTitle(getString(R.string.fail_getting_news))
                   .setMessage(getString(R.string.something_went_wrong_getting_news_for_))
                   .setPositiveButton(getString(R.string.try_again), new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                           presenter.presentFeed();
                           dialog.dismiss();
                       }
                   }).create();
        }

        tryAgainDialog.show();
    }

    @Override
    public void onPostClick(Post post) {
        presenter.presentPost(post);
    }

    @Override
    public void onCommentsClick(Post post) {
        presenter.presentPostDetails(post);
    }

    @Override
    public void onBrowseClick(Post post) {
        presenter.browse(post);
    }
}
