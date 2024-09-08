package com.envigite.horoscopapp.data

import android.util.Log
import com.envigite.horoscopapp.data.network.HoroscopeApiService
import com.envigite.horoscopapp.data.network.response.PredictionResponse
import com.envigite.horoscopapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionResponse? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return@onSuccess it }
            .onFailure { Log.i("Fallo", "Ha ocurrido un error ${it.message}") }

        return null
    }
}