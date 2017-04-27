package com.example.eduardocucharro.reediteye.data;

import com.example.eduardocucharro.reediteye.reedit.FeedResponse;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class FlatFeedResponseFunc implements Func1<FeedResponse, Observable<FeedResponse.DataBeanX.ChildrenBean>> {
    @Override
    public Observable<FeedResponse.DataBeanX.ChildrenBean> call(FeedResponse reeditResponse) {
        return Observable.from(reeditResponse.getData().getChildren());
    }
}
