package com.example.eduardocucharro.reediteye.feed;

import com.example.eduardocucharro.reediteye.Injector;
import com.example.eduardocucharro.reediteye.data.FeedService;
import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.util.BaseSchedulerProvider;
import com.example.eduardocucharro.reediteye.util.CacheService;

import rx.Subscription;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class FeedPresenterImpl implements FeedPresenter {

    private static final int POST_QTY = 25;
    private final FeedService service;
    private final FeedView view;
    private final CacheService cache;
    private final BaseSchedulerProvider schedulerProvider;
    private Subscription subscription;

    public FeedPresenterImpl(FeedView view,
                             FeedService service,
                             CacheService cacheService,
                             BaseSchedulerProvider schedulerProvider) {
        this.view = view;
        this.service = service;
        this.cache = cacheService;
        this.schedulerProvider = schedulerProvider;
    }

    @Override
    public void presentFeed() {

        if (!view.isNetworksEnabled()) {
            view.showEnableNetworksDialog();
            return;
        }

        if(!cache.isEmpty() && view.hasItems()) return;

        if(!cache.isEmpty() && !view.hasItems()) {
            cache.getCachedItens()
                    .subscribeOn(schedulerProvider.io())
                    .observeOn(schedulerProvider.ui())
                    .subscribe(Injector.provideNextPostAction(view),
                            Injector.providePostErrorAction(view),
                            Injector.providePostCompleteAction(view));
            return;
        }

        refresh();
    }

    @Override
    public void presentMore() {

        if(!view.isPagingEnabled()) return;

        Post post = view.getTailPost();

        if(post == null) return;

        view.setPagingEnabled(false);

        subscription = service.getPosts(POST_QTY, post.getName())
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(Injector.provideNextPostAction(view),
                        Injector.providePostErrorAction(view),
                        Injector.providePostCompleteAction(view));
    }

    @Override
    public void refresh() {
        if (!view.isNetworksEnabled()) {
            view.showEnableNetworksDialog();
            return;
        }

        view.showProgress();

        subscription = service.getPosts()
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(Injector.provideNextCachedPostAction(view),
                        Injector.providePostErrorAction(view),
                        Injector.providePostCompleteAction(view));
    }

    @Override
    public void stop() {
        if (subscription != null) subscription.unsubscribe();
    }

    @Override
    public void presentPost(Post post) {
        view.showPostDetails(post);
    }

    @Override
    public void presentPostDetails(Post post) {
        view.showPostDetails(post);
    }

    @Override
    public void browse(Post post) {
        if(view.supportsCustom()) {
            view.browseOnCustom(post);
            return;
        }

        view.browseUrl(post);
    }
}
