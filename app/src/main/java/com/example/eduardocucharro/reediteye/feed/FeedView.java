package com.example.eduardocucharro.reediteye.feed;

import com.example.eduardocucharro.reediteye.data.Post;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public interface FeedView {
    boolean isNetworksEnabled();

    void showEnableNetworksDialog();

    void showPost(Post post);

    void showProgress();

    void hideProgress();

    void showPostDetails(Post post);

    Post getTailPost();

    void browseUrl(Post post);

    void browseOnCustom(Post post);

    boolean supportsCustom();



    boolean isPagingEnabled();

    void setPagingEnabled(boolean b);

    boolean hasItems();

    void showTryAgainDialog();
}
