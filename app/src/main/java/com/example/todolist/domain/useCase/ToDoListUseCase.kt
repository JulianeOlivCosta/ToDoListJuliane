package com.example.todolist.domain.useCase

import com.example.todolist.domain.entities.ToDoItemsEntity

interface ToDoListUseCase {
    suspend fun getToDoItemsList(toDoItemsList: List<ToDoItemsEntity>)
    suspend fun insertNewToDoItem(toDoItem: ToDoItemsEntity)


}