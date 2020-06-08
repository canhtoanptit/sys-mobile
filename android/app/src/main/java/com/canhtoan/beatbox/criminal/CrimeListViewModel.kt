package com.canhtoan.beatbox.criminal

import androidx.lifecycle.ViewModel
import com.canhtoan.beatbox.criminal.repository.CrimeRepository

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()

    val crimes = crimeRepository.getCrimes()

    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }
}