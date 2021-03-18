package com.example.todolist.repository

import com.example.todolist.domain.entities.ToDoItemsEntity

interface ToDoListRepository {
    suspend fun insertNewToDoItem(toDoItem: ToDoItemsEntity)
}