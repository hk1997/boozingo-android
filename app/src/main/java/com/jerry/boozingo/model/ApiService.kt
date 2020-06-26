package com.jerry.boozingo.model

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {

    private val BASE_URL =
        "https://mutualfundcalculator.in" //MAIN DOMAIN JAHA HUM CALL LAGA RAHE HAI

    //IGNORE NEECHE KA FOR NOW

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()

    fun getApi(): JSONPlaceHolderAPI {// YOU WILL SEE THIS GET API BEING CALLED IN THE VIEWMDODEL
        return api.create(JSONPlaceHolderAPI::class.java)
    }


}