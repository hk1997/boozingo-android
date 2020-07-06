package com.jerry.boozingo.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class BoozePlace(
    @SerializedName("id")
    val placeId: String?,

    @SerializedName("name")
    val placeName: String?,

    @SerializedName("address")
    val placeAdress: String?,

    @SerializedName("details")
    val placeDetails: String?,

    @SerializedName("city_id")
    val cityId: String?,

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
    val placeRating: String?,

    @SerializedName("rating_count")
    val placeRatingCount: String?,

    @SerializedName("type")
    val placeType: String?,

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

    @SerializedName("shopImages")
    val placeShopImage: List<ShopImage>?,

    @SerializedName("location")
    val placeLocation: Location? // CLASS MADE TO DEAL WITH LOCATION

)

data class ShopImage(
    @SerializedName("id")
    val id: String?,

    @SerializedName("shopID")
    val shopID: String?,

    @SerializedName("imageURL")
    val imageURL: String?,

    @SerializedName("isActive")
    val isActive: String?,

    @SerializedName("isHighlighted")
    val isHighlighted: String?,

    @SerializedName("createdAt")
    val createdAt: String?,

    @SerializedName("updatedAt")
    val updatedAt: String?
)

data class Location(
    @SerializedName("type")
    val locationPoint: String?,

    @SerializedName("ccordinates")
    val locationCordinates: ArrayList<Double>? //COORDS ARE A [123, 432] HENCE LIST OF DOUBLE
)