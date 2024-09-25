package com.envigite.horoscopapp.motherobject

import com.envigite.horoscopapp.data.network.response.PredictionResponse
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Aquarius
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Aries
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Cancer
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Capricorn
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Gemini
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Leo
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Libra
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Pisces
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Sagittarius
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Scorpio
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Taurus
import com.envigite.horoscopapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}