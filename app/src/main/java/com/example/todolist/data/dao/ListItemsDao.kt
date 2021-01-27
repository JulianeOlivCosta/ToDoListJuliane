package com.example.todolist.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.todolist.domain.entities.ToDoItemsEntity

@Dao
interface ListItemsDao {

    @Query("SELECT * FROM todo_items")
    fun getAll(): List<ToDoItemsEntity>

    @Insert
    fun insertAll(toDoItemsEntity: ToDoItemsEntity)
}