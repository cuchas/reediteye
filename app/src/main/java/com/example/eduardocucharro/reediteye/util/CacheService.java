package com.example.eduardocucharro.reediteye.util;

import com.example.eduardocucharro.reediteye.data.Post;

import rx.Observable;

/**
 * Created by eduardocucharro on 27/04/17.
 */

public interface CacheService<T> {
    void add(T t);
    Observable<T> getCachedItens();
    void clean();
    boolean isEmpty();
}
