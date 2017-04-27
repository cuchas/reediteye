package com.example.eduardocucharro.reediteye.data;

import rx.Observable;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public interface FeedService {
    Observable<Post> getPosts();

    Observable<Post> getPosts(int count, String idRef);

    Observable<Comment> getComments(String id, String title);
}
