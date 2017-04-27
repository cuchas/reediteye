package com.example.eduardocucharro.reediteye.feed;

import rx.functions.Action1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class PostErrorAction implements Action1<Throwable> {

    private final FeedView view;

    public PostErrorAction(FeedView view) {
        this.view = view;
    }

    @Override
    public void call(Throwable throwable) {
        if(view.hasItems()) return;

        view.showTryAgainDialog();
    }
}
