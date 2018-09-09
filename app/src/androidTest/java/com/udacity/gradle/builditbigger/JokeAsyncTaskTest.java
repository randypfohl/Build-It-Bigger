package com.udacity.gradle.builditbigger;

import android.support.test.espresso.ViewAction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import junit.framework.Assert;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.ExecutionException;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class JokeAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void uiJokeTaskTest() {

        onView(withId(R.id.joke_button)).perform(click());

        onView(withId(R.id.joke_tv)).check(matches(not(withText(""))));
    }

//    @Test(timeout=5000)
//    public void asyncTaskTest() {
//
//        onView(withId(R.id.joke_button));
//
//        JokeAsyncTask asyncJokeTask = new JokeAsyncTask();
////        asyncJokeTask.execute(new IJokeCallback() {
////            @Override
////            public void jokeLoaded(String string) {
////                assertTrue(string != null && !string.equals(""));
////            }
////        });
//        String result = null;
//        try{
//           result = asyncJokeTask.get();
//       }
//       catch(Exception e){
//           e.printStackTrace();
//       }
//
//       Assert.assertTrue(result != null && !result.equals("") );
//    }
}