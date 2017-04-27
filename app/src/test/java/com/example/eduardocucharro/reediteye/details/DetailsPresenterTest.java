package com.example.eduardocucharro.reediteye.details;

import com.example.eduardocucharro.reediteye.data.Comment;
import com.example.eduardocucharro.reediteye.data.FeedService;
import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.util.ImmediateSchedulerProvider;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import rx.Observable;

import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

/**
 * Created by eduardocucharro on 28/04/17.
 */

public class DetailsPresenterTest {

    private static final String POST_ID = "asdf";
    private static final String POST_PATH = "some-random-comment";
    static Post post;

    static {
         post = new Post(POST_ID, POST_PATH, Calendar.getInstance().getTime());
    }

    @Mock
    DetailsView view;

    @Mock
    FeedService service;
    private DetailsPresenterImpl presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        List<Comment> commentList = new ArrayList<>();
        commentList.add(new Comment("asdfas", "asdf", "asdfasd", Calendar.getInstance().getTime()));
        commentList.add(new Comment("asdfas", "asdf", "asdfasd", Calendar.getInstance().getTime()));
        commentList.add(new Comment("asdfas", "asdf", "asdfasd", Calendar.getInstance().getTime()));

        when(service.getComments(POST_ID, POST_PATH))
                .thenReturn(Observable.from(commentList));

        presenter = new DetailsPresenterImpl(view, service, new ImmediateSchedulerProvider());
    }

    @Test
    public void presentDetails_showProgress_whenLoadingComments() {

        when(view.getPost()).thenReturn(post);

        presenter.presentDetails();

        verify(view).showProgress();
    }

    @Test
    public void presentDetails_doNothing_whenPostIsNull() {

        when(view.getPost()).thenReturn(null);

        presenter.presentDetails();

        verify(view).getPost();
        verifyNoMoreInteractions(view);
    }

    @Test
    public void presentDetails_getComments() {
        when(view.getPost()).thenReturn(post);

        presenter.presentDetails();

        verify(service).getComments(POST_ID, POST_PATH);
    }

    @Test
    public void share_showSharingUI_whenSupportsSharing(){

        when(view.supportsSharing()).thenReturn(true);

        when(view.getPost()).thenReturn(post);

        presenter.share();

        verify(view).showSharingUI();
    }

    @Test
    public void share_doNothing_whenPostNull() {
        when(view.getPost()).thenReturn(null);

        presenter.share();

        verify(view).getPost();

        verifyNoMoreInteractions(view);
    }
}
