package com.example.eduardocucharro.reediteye.data;

import com.example.eduardocucharro.reediteye.reedit.CommentsResponse;

import rx.functions.Func1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class FilterEmptyCommentFunc implements Func1<CommentsResponse.DataBeanXXXXX.ChildrenBeanXX, Boolean> {

    @Override
    public Boolean call(CommentsResponse.DataBeanXXXXX.ChildrenBeanXX childrenBeanXX) {
        CommentsResponse.DataBeanXXXXX.ChildrenBeanXX.DataBeanXXXX data = childrenBeanXX.getData();
        return data.getBody() != null && !data.getBody().isEmpty();
    }
}
