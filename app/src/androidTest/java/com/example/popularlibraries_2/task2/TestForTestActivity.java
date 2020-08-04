package com.example.popularlibraries_2.task2;

import androidx.test.rule.ActivityTestRule;

import com.example.popularlibraries_2.R;
import com.example.popularlibraries_2.hw7.task2.TestActivity;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class TestForTestActivity {
    @Rule
    public ActivityTestRule<TestActivity> activityTestRule = new ActivityTestRule<>(TestActivity.class);

    @Test
    public void onClick() {
        onView(withId(R.id.testBtn)).perform(click());
        onView(withId(R.id.testView)).check(matches(isDisplayed()));
    }
}
