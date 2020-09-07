package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "basic_craft_essence")
data class CraftEssenceItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("collectionNo")
    val collectionNo: Long?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("className")
    val className: String?,
    @SerializedName("rarity")
    val rarity: Int?,
    @SerializedName("face")
    val face: String?
) {
    @PrimaryKey(autoGenerate = false)
    var mCraftId: Long = collectionNo!!.toLong()
}