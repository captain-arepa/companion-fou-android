package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "hits_distribution"
)
data class HitsDistribution(
    @Embedded
    @SerializedName("arts")
    val arts: List<Int?>?,
    @Embedded
    @SerializedName("buster")
    val buster: List<Int?>?,
    @Embedded
    @SerializedName("quick")
    val quick: List<Int?>?,
    @Embedded
    @SerializedName("extra")
    val extra: List<Int?>?
) {
    @PrimaryKey(autoGenerate = true)
    var nHitDistId: Long = 0
}