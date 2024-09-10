package com.envigite.horoscopapp.domain

import com.envigite.horoscopapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}