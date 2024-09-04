package com.envigite.horoscopapp.data.providers

import com.envigite.horoscopapp.domain.model.HoroscopeInfo
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor(){
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Tauro,
            Geminis,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Escorpio,
            Sagitario,
            Capricornio,
            Acuario,
            Piscis
        )
    }
}