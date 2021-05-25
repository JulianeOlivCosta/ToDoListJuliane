package com.example.todolist.domain.useCase

import com.example.todolist.domain.entities.TaskEntity

interface TaskUseCase {
    suspend fun insertNewToDoItem(taskItem: TaskEntity)

    suspend fun updateToDoItems(taskItems: List<TaskEntity?>)

    suspend fun deleteToDoItem(taskItem: TaskEntity)

    suspend fun deleteAllToDoItems()

    suspend fun getAllToDoItems()
}