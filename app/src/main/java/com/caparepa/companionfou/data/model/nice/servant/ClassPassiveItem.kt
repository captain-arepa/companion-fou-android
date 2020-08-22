package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class ClassPassiveItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("coolDown")
    val coolDown: List<Int?>? = null,
    @SerializedName("actIndividuality")
    val actIndividuality: List<IndividualityItem?>? = null,
    @SerializedName("script")
    val script: Script? = null,
    @SerializedName("functions")
    val functions: List<FunctionItem?>? = null
)