package com.example.todolist.view.tasks

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.todolist.R
import com.example.todolist.databinding.TasksActivityBinding
import com.example.todolist.view.taskItemDetail.TaskAddItemActivity
import com.google.android.material.tabs.TabLayout

class TasksActivity : AppCompatActivity() {

    private val binding by lazy {
        TasksActivityBinding.inflate(layoutInflater)
    }
    private lateinit var toDoFragment: ToDoFragment
    private lateinit var doneFragment: DoneFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupTabLayout(binding.tabLayoutTodoList, binding.viewPager)
        setViewPager()
        binding.addButtonToDoItem.setOnClickListener {
            val intent = TaskAddItemActivity.getIntent(
                activity = this
            )
            startActivity(intent)
        }

    }

    private fun setViewPager() {
        binding.viewPager.adapter = BasePagerAdapter(
            fragmentList = getFragmentList(),
            fragmentManager = supportFragmentManager,
            titleList = getTitleList()
        )
    }

    private fun getTitleList() = listOf(
        getString(R.string.task_toDo_tab_title),
        getString(R.string.task_done_tab_title)
    )

    private fun getFragmentList(): List<Fragment> {
        toDoFragment = ToDoFragment.newInstance()
        doneFragment = DoneFragment.newInstance()
        return listOf(toDoFragment, doneFragment)
    }

    private fun setupTabLayout(tabLayout: TabLayout, viewPager: ViewPager) =
        tabLayout.setupWithViewPager(viewPager)

    companion object {
        fun getIntent(
            activity: Activity
        ) = Intent(activity, TasksActivity::class.java)
    }
}