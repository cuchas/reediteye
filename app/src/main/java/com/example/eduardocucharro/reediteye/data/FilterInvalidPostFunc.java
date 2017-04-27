package com.example.eduardocucharro.reediteye.data;

import com.example.eduardocucharro.reediteye.reedit.FeedResponse;

import rx.functions.Func1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class FilterInvalidPostFunc implements Func1<FeedResponse.DataBeanX.ChildrenBean, Boolean> {
    @Override
    public Boolean call(FeedResponse.DataBeanX.ChildrenBean childrenBean) {
        FeedResponse.DataBeanX.ChildrenBean.DataBean data = childrenBean.getData();
        return data.getId() != null && !data.getId().isEmpty() &&
                data.getCreated_utc() != null && !data.getCreated_utc().isEmpty() &&
                data.getTitle() != null && !data.getTitle().isEmpty();
    }
}
