package com.example.eduardocucharro.reediteye.feed;

import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.util.CacheService;

import rx.functions.Action1;

/**
 * Created by eduardocucharro on 27/04/17.
 */

public class NextCachedPostAction implements Action1<Post> {

    private final FeedView view;
    private final CacheService service;

    public NextCachedPostAction(FeedView view, CacheService service) {
        this.view = view;
        this.service = service;
    }

    @Override
    public void call(Post post) {
        service.add(post);
        view.showPost(post);
    }
}
