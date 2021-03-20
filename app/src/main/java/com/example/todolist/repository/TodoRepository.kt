package com.example.todolist.repository

import com.example.todolist.domain.entities.ToDoEntity

interface TodoRepository {
    suspend fun insertToDoItem(toDoItem: ToDoEntity)

    suspend fun updateToDoItems(toDoItems: List<ToDoEntity?>)

    suspend fun deleteToDoItem(toDoItem: ToDoEntity)

    suspend fun deleteAllToDoItems()

    suspend fun getAllToDoItems()
}