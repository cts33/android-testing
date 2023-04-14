package com.example.android.architecture.blueprints.todoapp.taskdetail

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.filters.MediumTest
import androidx.test.runner.AndroidJUnit4
import com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.data.Task
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @MediumTest—Marks the test as a "medium run-time" integration test (versus @SmallTest unit tests and @LargeTest end-to-end tests). This helps you group and choose which size of test to run.
@RunWith(AndroidJUnit4::class)—Used in any class using AndroidX Test.
 */
@MediumTest
@RunWith(AndroidJUnit4::class)
class TaskDetailFragmentTest{

    @Test
    fun activeTaskDetails_DisplayedInUi() {
        // GIVEN - Add active (incomplete) task to the DB
        val activeTask = Task("Active Task", "AndroidX Rocks", false)

        // TODO FragmentScenario is a class from AndroidX Test that wraps around a fragment and gives you direct
        //  control over the fragment's lifecycle for testing
        // WHEN - Details fragment launched to display task
        val bundle = TaskDetailFragmentArgs(activeTask.id).toBundle()
        launchFragmentInContainer<TaskDetailFragment>(bundle, R.style.AppTheme)

    }
}