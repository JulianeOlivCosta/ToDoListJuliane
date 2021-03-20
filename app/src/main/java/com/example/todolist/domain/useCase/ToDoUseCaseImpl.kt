package com.example.todolist.domain.useCase

import com.example.todolist.domain.entities.ToDoEntity
import com.example.todolist.repository.TodoRepository

class ToDoListUseCaseImpl(
    private val repository: TodoRepository
) : ToDoUseCase {
    override suspend fun insertNewToDoItem(toDoItem: ToDoEntity) {
        repository.insertToDoItem(toDoItem)
    }

    override suspend fun updateToDoItems(toDoItems: List<ToDoEntity?>) {
        repository.updateToDoItems(toDoItems)
    }

    override suspend fun deleteToDoItem(toDoItem: ToDoEntity) {
        repository.deleteToDoItem(toDoItem)
    }

    override suspend fun deleteAllToDoItems() {
        repository.deleteAllToDoItems()
    }

    override suspend fun getAllToDoItems() {
        repository.getAllToDoItems()
    }

}