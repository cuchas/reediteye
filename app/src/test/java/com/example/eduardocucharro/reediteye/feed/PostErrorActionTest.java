package com.example.eduardocucharro.reediteye.feed;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

/**
 * Created by eduardocucharro on 28/04/17.
 */

public class PostErrorActionTest {

    @Mock
    FeedView view;
    private PostErrorAction errorAction;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        errorAction = new PostErrorAction(view);
    }

    @Test
    public void call_doNothing_whenViewHasItens() {

        when(view.hasItems()).thenReturn(true);

        Throwable t = new Exception("Some random exception");
        errorAction.call(t);

        verify(view).hasItems();

        verifyNoMoreInteractions(view);
    }

    @Test
    public void call_showsTryAgainDialog_whenSomeErrorAndNoItensOnView() {
        when(view.hasItems()).thenReturn(false);

        Throwable t = new Exception("Some random exception");
        errorAction.call(t);

        verify(view).showTryAgainDialog();
    }
}
