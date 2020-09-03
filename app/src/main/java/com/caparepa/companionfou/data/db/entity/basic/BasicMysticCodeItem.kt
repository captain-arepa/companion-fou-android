package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "basic_mystic_code")
data class BasicMysticCodeItem(
    val id: Long? = null,
    val name: String? = null,
    @Embedded(prefix = "inner_")
    val item: EmbeddedMysticCodeItem? = null
) {
    @PrimaryKey(autoGenerate = false)
    var _id: Long = id!!
}