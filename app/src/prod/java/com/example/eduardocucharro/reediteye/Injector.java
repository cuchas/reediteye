package com.example.eduardocucharro.reediteye;

import com.example.eduardocucharro.reediteye.data.Comment;
import com.example.eduardocucharro.reediteye.data.FeedService;
import com.example.eduardocucharro.reediteye.data.FeedServiceImpl;
import com.example.eduardocucharro.reediteye.data.FilterEmptyCommentFunc;
import com.example.eduardocucharro.reediteye.data.FilterInvalidPostFunc;
import com.example.eduardocucharro.reediteye.data.FlatCommentsChildrenFunc;
import com.example.eduardocucharro.reediteye.data.FlatCommentsResponseFunc;
import com.example.eduardocucharro.reediteye.data.FlatFeedResponseFunc;
import com.example.eduardocucharro.reediteye.data.MapCommentFunc;
import com.example.eduardocucharro.reediteye.data.MapPostFunc;
import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.details.CommentCompleteAction;
import com.example.eduardocucharro.reediteye.details.CommentErrorAction;
import com.example.eduardocucharro.reediteye.details.DetailsPresenter;
import com.example.eduardocucharro.reediteye.details.DetailsPresenterImpl;
import com.example.eduardocucharro.reediteye.details.DetailsView;
import com.example.eduardocucharro.reediteye.details.NextCommentAction;
import com.example.eduardocucharro.reediteye.util.CacheService;
import com.example.eduardocucharro.reediteye.util.CacheServiceImpl;
import com.example.eduardocucharro.reediteye.feed.FeedPresenter;
import com.example.eduardocucharro.reediteye.feed.FeedPresenterImpl;
import com.example.eduardocucharro.reediteye.feed.FeedView;
import com.example.eduardocucharro.reediteye.feed.NextCachedPostAction;
import com.example.eduardocucharro.reediteye.feed.NextPostAction;
import com.example.eduardocucharro.reediteye.feed.PostCompleteAction;
import com.example.eduardocucharro.reediteye.feed.PostErrorAction;
import com.example.eduardocucharro.reediteye.reedit.CommentsResponse;
import com.example.eduardocucharro.reediteye.reedit.ReeditApi;
import com.example.eduardocucharro.reediteye.reedit.FeedResponse;
import com.example.eduardocucharro.reediteye.util.BaseSchedulerProvider;
import com.example.eduardocucharro.reediteye.util.SchedulerProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class Injector {

    private static final String REEDIT_API_URL = "https://www.reddit.com";
    private static Retrofit retrofit;
    private static ReeditApi reeditApi;
    private static CacheService cacheService;

    static ReeditApi provideReeditApi() {

        if (retrofit == null) {

            Gson gson = new GsonBuilder().setLenient().create();

            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder client = new OkHttpClient.Builder();
            client.addInterceptor(loggingInterceptor);

            retrofit = new Retrofit.Builder()
                    .baseUrl(REEDIT_API_URL)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(client.build())
                    .build();
        }

        if(reeditApi == null) {
            reeditApi = retrofit.create(ReeditApi.class);
        }

        return reeditApi;
    }

    public static BaseSchedulerProvider provideSchedulerProvider() {
        return SchedulerProvider.getInstance();
    }

    public static FeedPresenter provideFeedPresenter(FeedView view) {
        return new FeedPresenterImpl(
                view,
                provideReeditService(provideReeditApi()),
                provideCacheService(),
                provideSchedulerProvider());
    }

    private static FeedService provideReeditService(ReeditApi reeditApi) {
        return new FeedServiceImpl(reeditApi);
    }

    public static DetailsPresenter provideDetailsPresenter(DetailsView view) {
        return new DetailsPresenterImpl(
                view,
                provideReeditService(provideReeditApi()),
                provideSchedulerProvider());
    }

    public static Func1<? super FeedResponse, ? extends Observable<FeedResponse.DataBeanX.ChildrenBean>> provideFlatFeedFunc() {
        return new FlatFeedResponseFunc();
    }

    public static Func1<Object, Post> provideMapPostFunc() {
        return new MapPostFunc();
    }

    public static Func1<CommentsResponse.DataBeanXXXXX.ChildrenBeanXX, Comment> provideMapCommentFunc() {
        return new MapCommentFunc();
    }

    public static Func1<CommentsResponse.DataBeanXXXXX.ChildrenBeanXX, Boolean> provideFilterEmptyCommentFunc() {
        return new FilterEmptyCommentFunc();
    }

    public static Func1<FeedResponse.DataBeanX.ChildrenBean, Boolean> provideFilterInvalidPostFunc() {
        return new FilterInvalidPostFunc();
    }

    public static Func1<List<CommentsResponse>, Observable<?>> provideFlatCommentsResponseFunc() {
        return new FlatCommentsResponseFunc();
    }

    public static Func1<Object, Observable<CommentsResponse.DataBeanXXXXX.ChildrenBeanXX>> provideFlatCommentsChildrenFunc() {
        return new FlatCommentsChildrenFunc();
    }

    public static Action1<Post> provideNextPostAction(FeedView view) {
        return new NextPostAction(view);
    }

    public static Action1<Post> provideNextCachedPostAction(FeedView view) {
        return new NextCachedPostAction(view, provideCacheService());
    }

    public static Action1<Throwable> providePostErrorAction(FeedView view) {
        return new PostErrorAction(view);
    }

    public static Action0 providePostCompleteAction(FeedView view) {
        return new PostCompleteAction(view);
    }

    public static Action1<Comment> provideNextCommentAction(DetailsView view) {
        return new NextCommentAction(view);
    }

    public static Action1<Throwable> provideCommentErrorAction(DetailsView view) {
        return new CommentErrorAction(view);
    }

    public static Action0 provideCommentsCompleteAction(DetailsView view) {
        return new CommentCompleteAction(view);
    }

    public static CacheService provideCacheService() {
        if(cacheService == null) {
            cacheService = new CacheServiceImpl();
        }

        return cacheService;
    }
}
