package com.envigite.horoscopapp.domain.usecase

import com.envigite.horoscopapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}