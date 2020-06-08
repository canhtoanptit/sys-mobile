package com.canhtoan.beatbox

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SoundViewModel(private val beatBox: BeatBox) : BaseObservable() {
    var sound: Sound? = null
    set(sound) {
        field = sound
        notifyChange()
    }

    @get: Bindable
    val title: String?
    get() = sound?.name

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }
}