package com.example.todolist.view.taskItemDetail

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todolist.databinding.TaskItemDetailActivityBinding
import com.example.todolist.view.toDoList.ToDoViewModel
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
        }
    }

    private fun createNewTask() {
        val title = binding.editTextTaskTitle.text.toString()
        val description = binding.editTextTaskDescription.text.toString()
        val toDo = false
        viewModel.insertNewToDoItem(
            toDoTitle = title,
            toDoDescription = description,
            isConcluded = toDo
        )
    }

//    private fun startToDoListActivity() {
//
//    }

    companion object {
        fun getIntent(
            activity: Activity
        ) = Intent(activity, TaskAddItemActivity::class.java)
    }
}

