package com.canhtoan.beatbox.criminal

import android.app.Application
import com.canhtoan.beatbox.criminal.repository.CrimeRepository

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}