package com.example.todolist.view.toDoList

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todolist.databinding.TodoItemLayoutBinding

class ToDoListActivity : AppCompatActivity() {

    private val binding by lazy {
        TodoItemLayoutBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}