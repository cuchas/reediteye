package com.example.eduardocucharro.reediteye;


import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.details.PostDetailsActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Calendar;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class PostDetailsTest {

    @Rule
    public IntentsTestRule<PostDetailsActivity> testRule = new IntentsTestRule(PostDetailsActivity.class) {
        @Override
        protected Intent getActivityIntent() {
            Context context = InstrumentationRegistry.getContext();

            Post post = new Post();
            post.setId("asdf");
            post.setTitle("May the force be with you my friend");
            post.setUrl("http://www.youse.com.br");
            post.setDate(Calendar.getInstance().getTime());

            Intent intent = PostDetailsActivity.createIntent(context, post);

            return intent;
        }
    };

    @Test
    public void clickOnShare_startsSendIntent() {
        ViewInteraction interaction = onView(
                allOf(withId(R.id.menu_share), withContentDescription(R.string.share), isDisplayed()));

        interaction.perform(click());

        intended(hasAction(Intent.ACTION_SEND));
    }
}
