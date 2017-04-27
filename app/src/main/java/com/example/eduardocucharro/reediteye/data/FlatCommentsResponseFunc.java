package com.example.eduardocucharro.reediteye.data;

import com.example.eduardocucharro.reediteye.reedit.CommentsResponse;

import java.util.List;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class FlatCommentsResponseFunc implements Func1<List<CommentsResponse>, Observable<?>> {
    @Override
    public Observable<?> call(List<CommentsResponse> commentsResponses) {
        return Observable.from(commentsResponses);
    }
}
