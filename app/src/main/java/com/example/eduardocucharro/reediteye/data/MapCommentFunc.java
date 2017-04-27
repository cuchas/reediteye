package com.example.eduardocucharro.reediteye.data;

import com.example.eduardocucharro.reediteye.reedit.CommentsResponse;
import com.example.eduardocucharro.reediteye.util.DateUtils;

import java.util.Date;

import rx.functions.Func1;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class MapCommentFunc implements Func1<CommentsResponse.DataBeanXXXXX.ChildrenBeanXX, Comment> {
    @Override
    public Comment call(CommentsResponse.DataBeanXXXXX.ChildrenBeanXX childrenBeanXX) {
        String body = childrenBeanXX.getData().getBody();
        String id1 = childrenBeanXX.getData().getId();
        String author = childrenBeanXX.getData().getAuthor();
        String created_utc = childrenBeanXX.getData().getCreated_utc();
        Date date = DateUtils.parseUtc(created_utc);

        Comment comment = new Comment(author, id1, body, date);

        return comment;
    }
}
