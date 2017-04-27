package com.example.eduardocucharro.reediteye;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.espresso.matcher.ViewMatchers;

import com.example.eduardocucharro.reediteye.details.PostDetailsActivity;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;

/**
 * Created by eduardocucharro on 01/05/17.
 */

public class FeedNavTest {

    @Rule
    public IntentsTestRule<MainActivity> rule = new IntentsTestRule<>(MainActivity.class);

    @Test
    public void clickOnItem_startsDetailsActivity() {
        onView(ViewMatchers.withId(R.id.recycler_main))
                .perform(RecyclerViewActions.actionOnItemAtPosition(8, click()));

        intended(hasComponent(PostDetailsActivity.class.getName()));
    }
}
