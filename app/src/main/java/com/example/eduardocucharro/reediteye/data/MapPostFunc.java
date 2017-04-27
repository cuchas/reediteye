package com.example.eduardocucharro.reediteye.data;

import com.example.eduardocucharro.reediteye.reedit.FeedResponse;
import com.example.eduardocucharro.reediteye.util.DateUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rx.functions.Func1;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class MapPostFunc implements Func1<Object, Post> {

    @Override
    public Post call(Object o) {
        FeedResponse.DataBeanX.ChildrenBean bean =
                (FeedResponse.DataBeanX.ChildrenBean)o;

        FeedResponse.DataBeanX.ChildrenBean.DataBean data = bean.getData();

        Date date = DateUtils.parseUtc(data.getCreated_utc());

        Post post = new Post(data.getId(), data.getTitle(), date);
        post.setName(data.getName());
        post.setUrl(data.getUrl());
        post.setScore(data.getScore());
        post.setComments(data.getNum_comments());

        setImageUrl(data, post);

        return post;
    }

    private void setImageUrl(FeedResponse.DataBeanX.ChildrenBean.DataBean data, Post post) {
        FeedResponse.DataBeanX.ChildrenBean.DataBean.PreviewBean preview =
                data.getPreview();

        if(preview != null && preview.getImages().size() > 0) {
            FeedResponse.DataBeanX.ChildrenBean.DataBean.PreviewBean.ImagesBean images =
                    preview.getImages().get(0);

            FeedResponse.DataBeanX.ChildrenBean.DataBean.PreviewBean.ImagesBean.SourceBean source =
                    images.getSource();

            List<FeedResponse.DataBeanX.ChildrenBean.DataBean.PreviewBean.ImagesBean.ResolutionsBean> resolutions =
                    images.getResolutions();

            List<ImageSpec> list = new ArrayList<>(resolutions.size());

            for (FeedResponse.DataBeanX.ChildrenBean.DataBean.PreviewBean.ImagesBean.ResolutionsBean r : resolutions) {
                list.add(new ImageSpec(r.getUrl(), r.getWidth(), r.getHeight()));
            }

            post.setImageUrl(source.getUrl());
            post.setImageSpecList(list);
        }
    }
}
