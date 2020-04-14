package com.canhtoan.beatbox.criminal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.canhtoan.beatbox.R
import java.util.*

private const val TAG = "CrimeActivity"

class CrimeActivity : AppCompatActivity(), CrimeListFragment.Callbacks {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crime)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
         if (currentFragment == null) {
             val fragment = CrimeListFragment.newInstance()
             supportFragmentManager.beginTransaction()
                 .add(R.id.fragment_container, fragment)
                 .commit()
         }
    }

    override fun onCrimeSelected(crimeId: UUID) {
        val fragment = CrimeFragment.newInstance(crimeId)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}