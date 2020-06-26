package com.jerry.boozingo.model

import com.google.gson.annotations.SerializedName

data class BoozPlacesUsers(
    @SerializedName("id")
    val placeId: Int?,

    @SerializedName("name")
    val placeName: String?,

    @SerializedName("address")
    val placeAdress: String?,

    @SerializedName("details")
    val placeDetails: String?,

    @SerializedName("city_id")
    val cityId: Int?,

    @SerializedName("cost")
    val placeCost: String?,

    @SerializedName("longitude")
    val placeLongit: String?,

    @SerializedName("latitude")
    val placeLatit: String?,

    @SerializedName("time")
    val placeTime: String?,

    @SerializedName("contact")
    val placeContact: String?,

    @SerializedName("weeklySchedule")
    val placeSchedule: String?,

    @SerializedName("booze_served")
    val placeBooze: String?,

    @SerializedName("food")
    val placeFood: String?,

    @SerializedName("sitting_facility")
    val placeSitting: String?,

    @SerializedName("music")
    val placeMusic: String?,


    @SerializedName("payment")
    val placePayment: String?,


    @SerializedName("ac")
    val placeAc: String?,


    @SerializedName("rating")
    val placeRating: Int?,


    @SerializedName("rating_count")
    val placeRatingCount: String?,


    @SerializedName("type")
    val placeType: Int?,


    @SerializedName("createdAt")
    val placeCreated: String?,

    @SerializedName("updatedAt")
    val placeUpdated: Int?,



    @SerializedName("shopImageId")
    val placeShopImageId: Int?,


    @SerializedName("shop_id")
    val placeShopId: Int?,


    @SerializedName("distance")
    val placeDistance: Long?,


    @SerializedName("shopImage")
    val placeShopImage: Int?,

    @SerializedName("location")
    val placeLocation : Location?

    ){

}

data class Location(
    @SerializedName("type")
    val locationPoint: String?,

    @SerializedName("ccordinates")
    val locationCordinates: LongArray?
)