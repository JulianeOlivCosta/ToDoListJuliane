package com.example.todolist.domain.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//DAO interface
@Entity(tableName = "toDo_data_table")
data class ToDoEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "toDo_id")
    val id: Int,

    @ColumnInfo(name = "toDo_title")
    val title: String,

    @ColumnInfo(name = "toDo_description")
    val description: String,

    @ColumnInfo(name = "toDo_status")
    val isConcluded: Boolean
)