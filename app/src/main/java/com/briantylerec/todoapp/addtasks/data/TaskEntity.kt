package com.briantylerec.todoapp.addtasks.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskEntity(
    @PrimaryKey
    val id: Int = System.currentTimeMillis().hashCode(),
    val task: String,
    var selected: Boolean = false
)