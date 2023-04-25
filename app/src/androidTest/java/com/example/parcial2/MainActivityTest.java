package com.example.parcial2;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(AndroidJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void test1() {
        onView(withId(R.id.tv_fibo_et)).perform(typeText("6"), closeSoftKeyboard());
        onView(withId(R.id.btn_calcular)).perform(click());
    }

    @Test
    public void test2() {
        onView(withId(R.id.btn_calcular)).perform(click());
        onView(withText("Por favor ingrese un valor")).check(matches(isDisplayed()));
        onView(withText("OK")).perform(click());
    }

    @Test
    public void test3() {
        onView(withId(R.id.tv_fibo_et)).perform(typeText("0"), closeSoftKeyboard());
        onView(withId(R.id.btn_calcular)).perform(click());
        onView(withText("Error, el valor debe ser un número mayor a cero")).check(matches(isDisplayed()));
        onView(withText("OK")).perform(click());
    }

}