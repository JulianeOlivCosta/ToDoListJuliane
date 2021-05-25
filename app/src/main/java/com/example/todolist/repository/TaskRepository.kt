package com.example.todolist.repository

import com.example.todolist.domain.entities.TaskEntity

interface TaskRepository {
    suspend fun insertToDoItem(taskItem: TaskEntity)

    suspend fun updateToDoItems(taskItems: List<TaskEntity?>)

    suspend fun deleteToDoItem(taskItem: TaskEntity)

    suspend fun deleteAllToDoItems()

    suspend fun getAllToDoItems()
}