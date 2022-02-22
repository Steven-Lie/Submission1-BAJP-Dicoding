package com.dicoding.moviecatalogue.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.moviecatalogue.R
import com.dicoding.moviecatalogue.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {
    private val dummyMovie = DataDummy.generateMovie()
    private val dummyTv = DataDummy.generateTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).apply {
            check(matches(isDisplayed()))
            perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
        }
    }

    @Test
    fun loadTvs() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tv)).apply {
            check(matches(isDisplayed()))
            perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTv.size))
        }
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.img_poster)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].title)))
        }
        onView(withId(R.id.tv_release)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].releaseDate)))
        }
        onView(withId(R.id.tv_duration)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].duration)))
        }
        onView(withId(R.id.tv_genre)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].genre)))
        }
        onView(withId(R.id.tv_overview)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].overview)))
        }
    }

    @Test
    fun loadDetailTv() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tv)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.img_poster)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTv[0].title)))
        }
        onView(withId(R.id.tv_release)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTv[0].releaseDate)))
        }
        onView(withId(R.id.tv_duration)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTv[0].duration)))
        }
        onView(withId(R.id.tv_genre)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTv[0].genre)))
        }
        onView(withId(R.id.tv_overview)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTv[0].overview)))
        }
    }
}