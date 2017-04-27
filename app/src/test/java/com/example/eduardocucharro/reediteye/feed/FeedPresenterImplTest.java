package com.example.eduardocucharro.reediteye.feed;

import com.example.eduardocucharro.reediteye.data.FeedService;
import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.util.CacheService;
import com.example.eduardocucharro.reediteye.feed.FeedPresenter;
import com.example.eduardocucharro.reediteye.feed.FeedPresenterImpl;
import com.example.eduardocucharro.reediteye.feed.FeedView;
import com.example.eduardocucharro.reediteye.util.ImmediateSchedulerProvider;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import rx.Observable;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class FeedPresenterImplTest {
    @Mock
    FeedView view;

    FeedPresenter presenter;

    @Mock
    FeedService service;

    @Mock
    CacheService cacheService;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        List<Post> postList = new ArrayList<>();
        postList.add(new Post("asdf", "asdfasd", Calendar.getInstance().getTime()));
        postList.add(new Post("asdf", "asdfasd", Calendar.getInstance().getTime()));
        postList.add(new Post("asdf", "asdfasd", Calendar.getInstance().getTime()));

        Observable<Post> from = Observable.from(postList);

        when(service.getPosts()).thenReturn(from);
        when(service.getPosts(10, "asdf")).thenReturn(Observable.from(postList));
        when(cacheService.getCachedItens()).thenReturn(from);

        presenter = new FeedPresenterImpl(
                view,
                service,
                cacheService,
                new ImmediateSchedulerProvider());
    }

    @Test
    public void presentFeed_showEnableNetworksDialog_whenDisabled() {

        when(view.isNetworksEnabled()).thenReturn(false);

        presenter.presentFeed();

        verify(view).showEnableNetworksDialog();
    }

    @Test
    public void presentFeed_showProgress_whenCacheIsEmpty() {

        when(view.isNetworksEnabled()).thenReturn(true);
        when(cacheService.isEmpty()).thenReturn(true);
        when(view.hasItems()).thenReturn(false);

        presenter.presentFeed();

        verify(view).showProgress();
    }

    @Test
    public void presentFeed_showFromCache_whenCacheIsNotEmptyButViewIs() {
        when(view.isNetworksEnabled()).thenReturn(true);
        when(cacheService.isEmpty()).thenReturn(false);
        when(view.hasItems()).thenReturn(false);

        presenter.presentFeed();

        verify(cacheService).getCachedItens();
    }

    @Test
    public void presentFeed_notShowProgress_whenCacheIsNotEmptyButViewIs() {
        when(view.isNetworksEnabled()).thenReturn(true);
        when(cacheService.isEmpty()).thenReturn(false);
        when(view.hasItems()).thenReturn(false);

        presenter.presentFeed();

        verify(view, never()).showProgress();
    }

    @Test
    public void presentFeed_hideProgress_whenFinished() {
        when(view.isNetworksEnabled()).thenReturn(true);

        presenter.presentFeed();

        verify(view).hideProgress();
    }

    @Test
    public void presentMore_doNothing_when_pagingDisabled() {
        when(view.isPagingEnabled()).thenReturn(false);

        presenter.presentMore();

        verify(view).isPagingEnabled();
        verifyNoMoreInteractions(view);
    }

    @Test
    public void refresh_showProgress() {
        when(view.isNetworksEnabled()).thenReturn(true);

        presenter.refresh();

        verify(view).showProgress();
    }

    @Test
    public void browse_browseUrl_when_customTabsNotSupported() {
        when(view.supportsCustom()).thenReturn(false);

        Post post = new Post();

        presenter.browse(post);

        verify(view).browseUrl(post);
    }

    @Test
    public void browse_browseCustom_when_customTabsSupported() {
        when(view.supportsCustom()).thenReturn(true);

        Post post = new Post();

        presenter.browse(post);

        verify(view).browseOnCustom(post);
    }
}
