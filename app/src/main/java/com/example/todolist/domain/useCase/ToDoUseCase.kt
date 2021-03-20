package com.example.todolist.domain.useCase

import com.example.todolist.domain.entities.ToDoEntity

interface ToDoUseCase {
    suspend fun insertNewToDoItem(toDoItem: ToDoEntity)

    suspend fun updateToDoItems(toDoItems: List<ToDoEntity?>)

    suspend fun deleteToDoItem(toDoItem: ToDoEntity)

    suspend fun deleteAllToDoItems()

    suspend fun getAllToDoItems()
}