package com.example.todolist.repository

import com.example.todolist.data.ListItemsDao
import com.example.todolist.domain.entities.ToDoItemsEntity

class ToDoListRepositoryImpl(
    private val listItemsDao: ListItemsDao
) : ToDoListRepository {
    val toDoListItems = listItemsDao.getAll()

    override suspend fun insertNewToDoItem(toDoItemEntity: ToDoItemsEntity) {
        listItemsDao.insertAll(toDoItemEntity)
    }
}