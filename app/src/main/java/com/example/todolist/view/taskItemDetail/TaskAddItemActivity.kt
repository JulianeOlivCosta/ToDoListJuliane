package com.example.todolist.view.taskItemDetail

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todolist.databinding.TaskItemDetailActivityBinding
import com.example.todolist.view.tasks.TasksActivity
import com.example.todolist.view.tasks.ToDoViewModel
import org.koin.android.ext.android.inject

class TaskAddItemActivity : AppCompatActivity() {

    private val binding by lazy {
        TaskItemDetailActivityBinding.inflate(layoutInflater)
    }
    private val viewModel by inject<ToDoViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        saveButton()
    }

    private fun saveButton() {
        binding.addButtonToDoItem.setOnClickListener {
            createNewTask()
            startTasksActivity()
        }
    }

    private fun startTasksActivity() {
        val intent = TasksActivity.getIntent(
            activity = this
        )
        startActivity(intent)
    }


    private fun createNewTask() {
        val title = binding.editTextTaskTitle.text.toString()
        val description = binding.editTextTaskDescription.text.toString()
        viewModel.insertNewTask(
            toDoTitle = title,
            toDoDescription = description
        )
    }

    companion object {
        fun getIntent(
            activity: Activity
        ) = Intent(activity, TaskAddItemActivity::class.java)
    }
}

