package com.example.eduardocucharro.reediteye.feed;

import rx.functions.Action0;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class PostCompleteAction implements Action0 {

    private final FeedView view;

    public PostCompleteAction(FeedView view) {
        this.view = view;
    }

    @Override
    public void call() {
        view.hideProgress();
        view.setPagingEnabled(true);
    }
}
