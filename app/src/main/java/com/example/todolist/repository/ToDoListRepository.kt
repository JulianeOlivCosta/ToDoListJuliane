package com.example.todolist.repository

import com.example.todolist.data.ListItemsDao
import com.example.todolist.domain.entities.ToDoItemsEntity

class ToDoListRepository(
    private val dao: ListItemsDao
) {
    val toDoList = dao.getAll()

    suspend fun insertNewToDoItem(toDoItemEntity: ToDoItemsEntity) {
        dao.insertAll(toDoItemEntity)
    }
}