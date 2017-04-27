package com.example.eduardocucharro.reediteye.details;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.example.eduardocucharro.reediteye.Injector;
import com.example.eduardocucharro.reediteye.R;
import com.example.eduardocucharro.reediteye.data.Comment;
import com.example.eduardocucharro.reediteye.data.Post;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PostDetailsActivity extends AppCompatActivity implements DetailsView {

    public static final String EXTRA_POST = "EXTRA_POST";

    @BindView(R.id.recycler_post_details)
    RecyclerView recyclerView;

    @BindView(R.id.progress_post_details)
    ProgressBar progressBar;

    private Post post;
    private DetailsAdapter adapter;
    private DetailsPresenter presenter;

    public static Intent createIntent(Context context, Post post) {
        Intent intent = new Intent(context, PostDetailsActivity.class);
        intent.putExtra(EXTRA_POST, post);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);

        ButterKnife.bind(this);

        setStateInfo(savedInstanceState != null ? savedInstanceState : getIntent().getExtras());

        setupRecycler();

        setTitle(post.getTitle());

        setupToolbar();

        setupProgress();

        presenter = Injector.provideDetailsPresenter(this);
    }

    private void setupProgress() {
        progressBar.setVisibility(View.GONE);
    }

    private void setupToolbar() {
        ActionBar supportActionBar = getSupportActionBar();

        if(supportActionBar != null)
            supportActionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void setupRecycler() {
        adapter = new DetailsAdapter(this, post);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setStateInfo(Bundle bundle) {
        if(bundle == null) return;

        post = bundle.getParcelable(EXTRA_POST);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_share, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        } else if(item.getItemId() == R.id.menu_share) {
            presenter.share();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putParcelable(EXTRA_POST, post);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.presentDetails();
    }

    @Override
    protected void onStop() {
        presenter.stop();
        super.onStop();
    }

    @Override
    public Post getPost() {
        return post;
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showComment(Comment comment) {
        adapter.addComment(comment);
    }

    @Override
    public void showSharingUI() {
        Intent intent = createShareIntent(post);

        Intent chooser = Intent.createChooser(intent, getString(R.string.share));

        startActivity(chooser);
    }

    @Override
    public boolean supportsSharing() {
        PackageManager pm = getPackageManager();

        Intent intent = new Intent(Intent.ACTION_SEND);

        List<ResolveInfo> resolveInfoList = pm.queryIntentActivities(intent, 0);

        return resolveInfoList != null && resolveInfoList.size() > 0;
    }

    private Intent createShareIntent(Post post) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_TITLE, post.getTitle());
        i.putExtra(Intent.EXTRA_TEXT, post.getUrl());
        i.setType("text/plain");
        return i;
    }
}
