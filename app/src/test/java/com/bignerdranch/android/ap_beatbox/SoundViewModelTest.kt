package com.bignerdranch.android.ap_beatbox

import org.junit.Before

import org.junit.Assert.*
import javax.security.auth.Subject

class SoundViewModelTest {

    private lateinit var sound: Sound
    private lateinit var subject: SoundViewModel

    @Before
    fun setUp() {
        sound = Sound("assetPath")
        subject = SoundViewModel()
        subject.sound = sound
    }
}