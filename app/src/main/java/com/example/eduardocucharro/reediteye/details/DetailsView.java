package com.example.eduardocucharro.reediteye.details;

import com.example.eduardocucharro.reediteye.data.Comment;
import com.example.eduardocucharro.reediteye.data.Post;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public interface DetailsView {
    Post getPost();

    void showProgress();

    void hideProgress();

    void showComment(Comment comment);

    void showSharingUI();

    boolean supportsSharing();
}
