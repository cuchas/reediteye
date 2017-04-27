package com.example.eduardocucharro.reediteye.util;

import com.example.eduardocucharro.reediteye.data.Post;

import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;

import rx.Observable;

/**
 * Created by eduardocucharro on 27/04/17.
 */

public class CacheServiceImpl implements CacheService<Post> {

    static ConcurrentSkipListSet<Post> list = new ConcurrentSkipListSet<>(new Comparator<Post>() {
        @Override
        public int compare(Post o1, Post o2) {
            boolean b = o1.getDate().equals(o2.getDate());

            return b ? 0 : o1.getDate().after(o2.getDate()) ? -1 : 1;
        }
    });

    @Override
    public void add(Post post) {
        list.add(post);
    }

    @Override
    public Observable<Post> getCachedItens() {
        return Observable.from(list);
    }

    @Override
    public void clean() {
        list.clear();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
