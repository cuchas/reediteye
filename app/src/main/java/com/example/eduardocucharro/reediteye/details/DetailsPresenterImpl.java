package com.example.eduardocucharro.reediteye.details;

import com.example.eduardocucharro.reediteye.Injector;
import com.example.eduardocucharro.reediteye.data.FeedService;
import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.util.BaseSchedulerProvider;

import rx.Subscription;
/**
 * Created by eduardocucharro on 26/04/17.
 */

public class DetailsPresenterImpl implements DetailsPresenter {

    private final FeedService service;
    private final DetailsView view;
    private final BaseSchedulerProvider schedulerProvider;
    private Subscription subscription;

    public DetailsPresenterImpl(DetailsView view,
                                FeedService service,
                                BaseSchedulerProvider schedulerProvider) {
        this.view = view;
        this.service = service;
        this.schedulerProvider = schedulerProvider;
    }

    @Override
    public void presentDetails() {

        Post post = view.getPost();

        if (post == null) return;

        view.showProgress();

        subscription = service.getComments(post.getId(), post.getTitle())
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(Injector.provideNextCommentAction(view),
                        Injector.provideCommentErrorAction(view),
                        Injector.provideCommentsCompleteAction(view));
    }

    @Override
    public void stop() {
        if(subscription != null) subscription.unsubscribe();
    }

    @Override
    public void share() {
        if(view.getPost() == null) return;

        if(view.supportsSharing()) view.showSharingUI();
    }
}
