package com.example.eduardocucharro.reediteye.reedit;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public interface ReeditApi {

    @GET("/r/Android/new/.json")
    Observable<FeedResponse> getFeed();

    @GET("/r/Android/new/.json")
    Observable<FeedResponse> getFeed(@Query("count") int qty, @Query("after") String afterId);

    @GET("/r/Android/comments/{id}/{title}/.json")
    Observable<List<CommentsResponse>> getComments(@Path("id") String path, @Path("title") String title);
}
