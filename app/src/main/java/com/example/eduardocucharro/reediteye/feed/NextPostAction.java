package com.example.eduardocucharro.reediteye.feed;

import com.example.eduardocucharro.reediteye.data.Post;

import rx.functions.Action1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class NextPostAction implements Action1<Post> {

    private final FeedView view;

    public NextPostAction(FeedView view) {
        this.view = view;
    }

    @Override
    public void call(Post post) {
        view.showPost(post);
    }
}
