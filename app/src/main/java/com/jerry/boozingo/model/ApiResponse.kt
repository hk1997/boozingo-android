package com.jerry.boozingo.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    //THIS IS WHAT IS BEING RETURNED TO US FROM THE SERVER AS U CAN SEE IN POSTMAN
    @SerializedName("message")
    val message: String?,

    @SerializedName("data")
    val data: List<BoozePlace>? // DATA VARIABLE IS A LIST OF BOOZE PLACES

)