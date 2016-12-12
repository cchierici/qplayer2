package org.qstuff.qplayer;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class QPlayerMainActivityTest {

    @Rule
    public ActivityTestRule<QPlayerMainActivity> mActivityTestRule = new ActivityTestRule<>(
        QPlayerMainActivity.class);

    @Test
    public void qPlayerMainActivityTest() {

        ViewInteraction textView = onView(
            allOf(withText("filebrowser"), isDisplayed()));
        textView.perform(click());

        ViewInteraction viewPager = onView(
            allOf(withId(org.qstuff.qplayer.R.id.content_pager), isDisplayed()));
        viewPager.perform(swipeLeft());

        ViewInteraction textView2 = onView(
            allOf(withText("playlists"), isDisplayed()));
        textView2.perform(click());

        ViewInteraction viewPager2 = onView(
            allOf(withId(org.qstuff.qplayer.R.id.content_pager), isDisplayed()));
        viewPager2.perform(swipeLeft());

        ViewInteraction imageButton = onView(
            allOf(withId(org.qstuff.qplayer.R.id.player_button_repeat),
                  withParent(withId(org.qstuff.qplayer.R.id.player_buttons_row_two)),
                  isDisplayed()));
        imageButton.perform(click());

        ViewInteraction imageButton2 = onView(
            allOf(withId(org.qstuff.qplayer.R.id.player_button_repeat),
                  withParent(withId(org.qstuff.qplayer.R.id.player_buttons_row_two)),
                  isDisplayed()));
        imageButton2.perform(click());

        ViewInteraction imageButton3 = onView(
            allOf(withId(org.qstuff.qplayer.R.id.player_button_repeat),
                  withParent(withId(org.qstuff.qplayer.R.id.player_buttons_row_two)),
                  isDisplayed()));
        imageButton3.perform(click());

        ViewInteraction imageButton4 = onView(
            allOf(withId(org.qstuff.qplayer.R.id.player_button_repeat),
                  withParent(withId(org.qstuff.qplayer.R.id.player_buttons_row_two)),
                  isDisplayed()));
        imageButton4.perform(click());

        ViewInteraction textView3 = onView(
            allOf(withText("filebrowser"), isDisplayed()));
        textView3.perform(click());

        ViewInteraction viewPager3 = onView(
            allOf(withId(org.qstuff.qplayer.R.id.content_pager), isDisplayed()));
        viewPager3.perform(swipeRight());

        ViewInteraction viewPager4 = onView(
            allOf(withId(org.qstuff.qplayer.R.id.content_pager), isDisplayed()));
        viewPager4.perform(swipeRight());
    }

}
