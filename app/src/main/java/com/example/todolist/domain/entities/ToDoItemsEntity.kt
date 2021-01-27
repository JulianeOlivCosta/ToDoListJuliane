package com.example.todolist.domain.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "toDo_items")
data class ToDoItemsEntity(
    @PrimaryKey val id: Int,

    @ColumnInfo(name = "toDo_title")
    val title: String,

    @ColumnInfo(name = "toDo_description")
    val description: String,

    @ColumnInfo(name = "toDo_status")
    val isConcluded: Boolean
)