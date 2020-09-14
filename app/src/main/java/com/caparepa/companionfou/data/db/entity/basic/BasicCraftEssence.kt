package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "basic_craft_essence")
data class BasicCraftEssence(
    @PrimaryKey
    val id: Long? = null,
    val collectionNo: Long? = null,
    val type: String? = null,
    val name: String? = null,
    val className: String? = null,
    val rarity: Int? = null,
    val face: String? = null
)