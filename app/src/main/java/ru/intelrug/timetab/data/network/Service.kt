package ru.intelrug.timetab.data.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ru.intelrug.timetab.data.network.dto.GroupsGetManyDto
import ru.intelrug.timetab.data.network.dto.GroupsGetOneDto
import ru.intelrug.timetab.util.NetworkUrlConstants

interface TimeTabService {

    @GET("groups")
    fun getAllGroups(): Deferred<GroupsGetManyDto>

    @GET("groups/{id}")
    fun getGroupById(@Path("id") id: Long): Deferred<GroupsGetOneDto>
}

/**
 * Main entry point for network access
 */
object TimeTabNetwork {
    // Configure retrofit to parse JSON and use coroutines
    private val retrofit = Retrofit.Builder()
        .baseUrl(NetworkUrlConstants.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    val timeTabService = retrofit.create(TimeTabService::class.java)
}