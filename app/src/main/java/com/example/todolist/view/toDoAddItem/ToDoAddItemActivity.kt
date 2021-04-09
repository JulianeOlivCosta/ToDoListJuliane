package com.example.todolist.view.toDoAddItem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todolist.databinding.TodoAddItemActivityBinding
import com.example.todolist.view.toDoList.ToDoViewModel
import org.koin.android.ext.android.inject

class ToDoAddItemActivity : AppCompatActivity() {

    private val binding by lazy {
        TodoAddItemActivityBinding.inflate(layoutInflater)
    }
    private val viewModel by inject<ToDoViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        saveButton()
    }

    private fun saveButton() {
        binding.addButtonToDoItem.setOnClickListener {
            val title = binding.editTextTaskTitle.text.toString()
            val description = binding.editTextTaskDescription.text.toString()
            val toDo = false
            viewModel.insertNewToDoItem(
                toDoTitle = title,
                toDoDescription = description,
                isConcluded = toDo
            )
            title.isBlank()
            description.isBlank()
        }
    }
}

