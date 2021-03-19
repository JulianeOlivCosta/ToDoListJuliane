package com.example.todolist.domain.useCase

import com.example.todolist.domain.entities.ToDoEntity

interface ToDoListUseCase {
    suspend fun getToDoItemsList(toDoItemsList: List<ToDoEntity>)
    suspend fun insertNewToDoItem(toDoItem: ToDoEntity)
}