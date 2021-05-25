package com.example.todolist.domain.useCase

import com.example.todolist.domain.entities.TaskEntity
import com.example.todolist.repository.TaskRepository

class TaskListUseCaseImpl(
    private val repository: TaskRepository
) : TaskUseCase {
    override suspend fun insertNewToDoItem(taskItem: TaskEntity) {
        repository.insertToDoItem(taskItem)
    }

    override suspend fun updateToDoItems(taskItems: List<TaskEntity?>) {
        repository.updateToDoItems(taskItems)
    }

    override suspend fun deleteToDoItem(taskItem: TaskEntity) {
        repository.deleteToDoItem(taskItem)
    }

    override suspend fun deleteAllToDoItems() {
        repository.deleteAllToDoItems()
    }

    override suspend fun getAllToDoItems() {
        repository.getAllToDoItems()
    }

}