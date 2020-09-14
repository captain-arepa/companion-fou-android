package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "basic_command_code")
data class BasicCommandCode(
    @PrimaryKey
    val id: Long? = null,
    val collectionNo: Long? = null,
    val name: String? = null,
    val rarity: Int? = null,
    val face: String? = null
)