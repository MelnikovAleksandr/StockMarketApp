package ru.asmelnikov.stokemarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apiKey") apiKey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "325JGDTLZUXLJDJM"
        const val BASE_URL = "https://alphavantage.co/"
    }
}