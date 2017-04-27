package com.example.eduardocucharro.reediteye.data;

import com.example.eduardocucharro.reediteye.reedit.CommentsResponse;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class FlatCommentsChildrenFunc implements Func1<Object, Observable<CommentsResponse.DataBeanXXXXX.ChildrenBeanXX>> {
    @Override
    public Observable<CommentsResponse.DataBeanXXXXX.ChildrenBeanXX> call(Object o) {
        CommentsResponse response = (CommentsResponse) o;

        return Observable.from(response.getData().getChildren());
    }
}
