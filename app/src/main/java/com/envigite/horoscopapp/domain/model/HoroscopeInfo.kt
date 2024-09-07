package com.envigite.horoscopapp.domain.model

import com.envigite.horoscopapp.R

sealed class HoroscopeInfo(val img:Int, val name:Int){
    data object Aries:HoroscopeInfo(R.drawable.aries, R.string.aries)
    data object Tauro:HoroscopeInfo(R.drawable.tauro, R.string.tauro)
    data object Geminis:HoroscopeInfo(R.drawable.geminis, R.string.geminis)
    data object Cancer:HoroscopeInfo(R.drawable.cancer, R.string.cancer)
    data object Leo:HoroscopeInfo(R.drawable.leo, R.string.leo)
    data object Virgo:HoroscopeInfo(R.drawable.virgo, R.string.virgo)
    data object Libra:HoroscopeInfo(R.drawable.libra, R.string.libra)
    data object Escorpio:HoroscopeInfo(R.drawable.escorpio, R.string.escorpio)
    data object Sagitario:HoroscopeInfo(R.drawable.sagitario, R.string.sagitario)
    data object Capricornio:HoroscopeInfo(R.drawable.capricornio, R.string.capricornio)
    data object Acuario:HoroscopeInfo(R.drawable.aquario, R.string.acuario)
    data object Piscis:HoroscopeInfo(R.drawable.piscis, R.string.piscis)
}