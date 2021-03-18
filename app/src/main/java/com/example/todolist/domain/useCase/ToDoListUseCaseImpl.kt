package com.example.todolist.domain.useCase

import com.example.todolist.domain.entities.ToDoItemsEntity
import com.example.todolist.repository.ToDoListRepository

class ToDoListUseCaseImpl(
    private val repository: ToDoListRepository
) : ToDoListUseCase {
    override suspend fun getToDoItemsList(toDoItemsList: List<ToDoItemsEntity>) {
        TODO("Not yet implemented")
    }

    override suspend fun insertNewToDoItem(toDoItem: ToDoItemsEntity) {
        repository.insertNewToDoItem(toDoItem)
    }
}