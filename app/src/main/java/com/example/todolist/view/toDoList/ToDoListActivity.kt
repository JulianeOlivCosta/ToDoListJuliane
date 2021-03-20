package com.example.todolist.view.toDoList

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todolist.R

class ToDoListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.todo_add_item_activity)
    }
}