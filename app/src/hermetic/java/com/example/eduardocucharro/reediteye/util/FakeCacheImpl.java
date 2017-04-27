package com.example.eduardocucharro.reediteye.util;

import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.util.CacheService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import rx.Observable;

/**
 * Created by eduardocucharro on 29/04/17.
 */

public class FakeCacheImpl implements CacheService<Post> {

    static List<Post> list = new ArrayList<>();

    static {
        Calendar calendar = Calendar.getInstance();

        String title = "May the force be with you my friend";
        String title_2 = "Iron maiden is one of my favorite and yours?";
        String imageUrl = "https://i.redditmedia.com/yveDLo4ewW5L3Jojy-nuzV7fzstKNefEEj3Hghi7sAs.jpg?s=377d089263953d918de2be9224c1b45b";
        String youse = "https://www.youse.com.br/";

        for (int i = 0; i < 30; i++) {
            calendar.add(Calendar.SECOND, i * -1);
            Date time = calendar.getTime();
            Post post = new Post(time.toString(), String.valueOf(i) + " " + title, time);
            post.setComments(i);
            post.setImageUrl(imageUrl);
            post.setUrl(youse);

            list.add(post);

            calendar.add(Calendar.SECOND, i * -1);
            Date time_2 = calendar.getTime();
            Post post_2 = new Post(time_2.toString(), title_2, time_2);
            post_2.setComments(i + 1);
            post_2.setUrl(youse);

            list.add(post_2);
        }
    }

    @Override
    public void add(Post post) {
    }

    @Override
    public Observable<Post> getCachedItens() {
        return Observable.from(list);
    }

    @Override
    public void clean() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
