package com.example.todolist.repository

import com.example.todolist.data.TaskDAO
import com.example.todolist.domain.entities.TaskEntity

class TaskRepositoryImpl(
    private val taskDao: TaskDAO
) : TaskRepository {

    override suspend fun insertToDoItem(taskItem: TaskEntity) {
        taskDao.insertToDoItem(taskItem)
    }

    override suspend fun updateToDoItems(taskItems: List<TaskEntity?>) {
        taskDao.updateToDoItems(taskItems)
    }

    override suspend fun deleteToDoItem(taskItem: TaskEntity) {
        taskDao.deleteToDoItem(taskItem)
    }

    override suspend fun deleteAllToDoItems() {
        taskDao.deleteAll()
    }

    override suspend fun getAllToDoItems() {
        taskDao.getAllToDoItems()
    }
}