package com.example.eduardocucharro.reediteye.details;

import com.example.eduardocucharro.reediteye.data.Comment;

import rx.functions.Action1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class NextCommentAction implements Action1<Comment> {

    private final DetailsView view;

    public NextCommentAction(DetailsView view) {
        this.view = view;
    }

    @Override
    public void call(Comment comment) {
        view.showComment(comment);
    }
}
