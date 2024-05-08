package com.example.todoapp.model

import androidx.room.Entity


@Entity(tableName = "item_entity")
data class ItemEntity(
    val id: String = "",
    val title: String = "",
    val description: String? = null,
    val priority: String = "",
    val createdAt: Long = 0L,
    val categoryId: String = "",
)
