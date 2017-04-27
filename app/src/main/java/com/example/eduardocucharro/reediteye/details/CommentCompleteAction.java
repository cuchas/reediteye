package com.example.eduardocucharro.reediteye.details;

import rx.functions.Action0;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class CommentCompleteAction implements Action0 {

    private final DetailsView view;

    public CommentCompleteAction(DetailsView view) {
        this.view = view;
    }

    @Override
    public void call() {
        view.hideProgress();
    }
}
