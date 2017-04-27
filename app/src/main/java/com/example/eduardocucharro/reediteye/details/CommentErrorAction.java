package com.example.eduardocucharro.reediteye.details;

import rx.functions.Action0;
import rx.functions.Action1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class CommentErrorAction implements Action1<Throwable> {

    private final DetailsView view;

    public CommentErrorAction(DetailsView view) {
        this.view = view;
    }

    @Override
    public void call(Throwable throwable) {

    }
}
