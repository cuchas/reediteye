package com.example.eduardocucharro.reediteye.feed;

import com.example.eduardocucharro.reediteye.data.Post;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public interface FeedPresenter {
    void presentFeed();

    void presentMore();

    void refresh();

    void stop();

    void presentPost(Post post);

    void presentPostDetails(Post post);

    void browse(Post post);
}
