package com.example.todolist.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todolist.domain.entities.ToDoItemsEntity

@Database(entities = arrayOf(ToDoItemsEntity::class), version = 1)
abstract class ToDoItemsDataBase : RoomDatabase() {
    abstract fun listItemDao(): ListItemsDao
}