package com.example.eduardocucharro.reediteye.data;

import com.example.eduardocucharro.reediteye.Injector;
import com.example.eduardocucharro.reediteye.reedit.ReeditApi;

import rx.Observable;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class FeedServiceImpl implements FeedService {

    private final ReeditApi reeditApi;

    public FeedServiceImpl(ReeditApi reeditApi) {
        this.reeditApi = reeditApi;
    }

    @Override
    public Observable<Post> getPosts() {
        return reeditApi.getFeed()
                .flatMap(Injector.provideFlatFeedFunc())
                .filter(Injector.provideFilterInvalidPostFunc())
                .map(Injector.provideMapPostFunc());
    }

    @Override
    public Observable<Post> getPosts(int count, String idRef) {
        return reeditApi.getFeed(count, idRef)
                .flatMap(Injector.provideFlatFeedFunc())
                .filter(Injector.provideFilterInvalidPostFunc())
                .map(Injector.provideMapPostFunc());
    }

    @Override
    public Observable<Comment> getComments(String id, String title) {
        return reeditApi.getComments(id, title)
                .flatMap(Injector.provideFlatCommentsResponseFunc())
                .flatMap(Injector.provideFlatCommentsChildrenFunc())
                .filter(Injector.provideFilterEmptyCommentFunc())
                .map(Injector.provideMapCommentFunc());
    }
}
