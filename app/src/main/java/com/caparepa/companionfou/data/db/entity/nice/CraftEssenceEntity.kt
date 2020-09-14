package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "craft_essence",
    indices = [
        Index(value = ["collection_no"], unique = true)
    ]
)
data class CraftEssenceEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Long? = null,
    @ColumnInfo(name = "collection_no")
    val collectionNo: Long? = null,
    @ColumnInfo(name = "name")
    val name: String? = null,
    @ColumnInfo(name = "type")
    val type: String? = null,
    @ColumnInfo(name = "rarity")
    val rarity: Int? = null,
    @ColumnInfo(name = "cost")
    val cost: Int? = null,
    @ColumnInfo(name = "lv_max")
    val lvMax: Int? = null,
    @ColumnInfo(name = "extra_assets")
    val extraAssets: String? = null,
    @ColumnInfo(name = "atk_base")
    val atkBase: Int? = null,
    @ColumnInfo(name = "atk_max")
    val atkMax: Int? = null,
    @ColumnInfo(name = "hp_base")
    val hpBase: Int? = null,
    @ColumnInfo(name = "hp_max")
    val hpMax: Int? = null,
    @ColumnInfo(name = "growth_curve")
    val growthCurve: Int? = null,
    @ColumnInfo(name = "atk_growth")
    val atkGrowth: String? = null,
    @ColumnInfo(name = "hp_growth")
    val hpGrowth: String? = null,
    @ColumnInfo(name = "skills")
    val skills: String? = null
) {
    fun getExtraAssets(): ExtraAssets? {
        return this.extraAssets?.toKotlinObject()
    }

    fun getAtkGrowth(): List<Int>? {
        return this.atkGrowth?.toKotlinObject()
    }

    fun getHpGrowth(): List<Int>? {
        return this.hpGrowth?.toKotlinObject()
    }

    fun getSkills(): List<SkillItem>? {
        return this.skills?.toKotlinObject()
    }
}