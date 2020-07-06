package com.jerry.boozingo.model

import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface JSONPlaceHolderAPI {

    @FormUrlEncoded //ignore just copy paste
    @POST("/boozingo/api/list") //..... THESE WILLL BE THE DIFF DIFF CALLS WE MAKE.
    fun getBoozePlaces(
        @Field("long") long: Long,   //....... THIS IS THE DATA WE ARE SENDING WHILE MAKING THE CALL......AS U CAN SEE IN POSTMAN
        @Field("lati") lati: Long,
        @Field("range") range: Long
    ): Single<ApiResponse> //this is what we expect to get back from the server ....


}