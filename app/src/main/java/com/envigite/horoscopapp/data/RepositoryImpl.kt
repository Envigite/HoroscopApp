package com.envigite.horoscopapp.data

import android.util.Log
import com.envigite.horoscopapp.data.network.HoroscopeApiService
import com.envigite.horoscopapp.domain.Repository
import com.envigite.horoscopapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Fallo", "Ha ocurrido un error ${it.message}") }
        return null
    }
}