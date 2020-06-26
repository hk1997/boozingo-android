package com.jerry.boozingo.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class BoozePlace(
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
    val placeUpdated: String?,

    @SerializedName("shopImageId")
    val placeShopImageId: String?,

    @SerializedName("shop_id")
    val placeShopId: String?,

    @SerializedName("distance")
    val placeDistance: String?,

    @SerializedName("shopImage")
    val placeShopImage: String?,

    @SerializedName("location")
    val placeLocation: Location? // CLASS MADE TO DEAL WITH LOCATION

)

data class Location(
    @SerializedName("type")
    val locationPoint: String?,

    @SerializedName("ccordinates")
    val locationCordinates: ArrayList<Double>? //COORDS ARE A [123, 432] HENCE LIST OF DOUBLE
)