package com.envigite.horoscopapp.domain

import com.envigite.horoscopapp.data.network.response.PredictionResponse

interface Repository {
    suspend fun getPrediction(sign: String): PredictionResponse?
}