package com.example.eduardocucharro.reediteye.data;

import com.example.eduardocucharro.reediteye.reedit.CommentsResponse;
import com.example.eduardocucharro.reediteye.reedit.FeedResponse;
import com.example.eduardocucharro.reediteye.reedit.ReeditApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by eduardocucharro on 01/05/17.
 */

public class FakeReeditApi implements ReeditApi {
    @Override
    public Observable<FeedResponse> getFeed() {
        return Observable.from(new ArrayList<FeedResponse>());
    }

    @Override
    public Observable<FeedResponse> getFeed(@Query("count") int qty, @Query("after") String afterId) {
        return Observable.from(new ArrayList<FeedResponse>());
    }

    @Override
    public Observable<List<CommentsResponse>> getComments(@Path("id") String path, @Path("title") String title) {
        return Observable.from(new ArrayList<List<CommentsResponse>>());
    }
}
