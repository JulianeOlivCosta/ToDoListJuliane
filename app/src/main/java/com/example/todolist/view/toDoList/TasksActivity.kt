package com.example.todolist.view.toDoList

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.todolist.databinding.TasksActivityBinding
import com.example.todolist.view.taskItemDetail.TaskAddItemActivity
import com.google.android.material.tabs.TabLayout

class TasksActivity : AppCompatActivity() {

    private val binding by lazy {
        TasksActivityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupTabLayout(binding.tabLayoutTodoList, binding.viewPager)
        binding.viewPager.adapter = BasePagerAdapter(
            fragmentList = listOf(ToDoFragment(), DoneFragment()),
            fragmentManager = supportFragmentManager,
            titleList = listOf("To Do", "Done")
        )
        binding.addButtonToDoItem.setOnClickListener {
            val intent = TaskAddItemActivity.getIntent(
                activity = this
            )
            startActivity(intent)
        }

    }

    private fun setupTabLayout(tabLayout: TabLayout, viewPager: ViewPager) =
        tabLayout.setupWithViewPager(viewPager)


}