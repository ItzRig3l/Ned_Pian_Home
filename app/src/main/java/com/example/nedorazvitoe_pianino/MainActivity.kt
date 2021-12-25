package com.example.nedorazvitoe_pianino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.AudioManager
import android.media.SoundPool
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private var soundPool: SoundPool? = null
    private var soundId1 = 0
    private var soundId2 = 0
    private var soundId3 = 0
    private var soundId4 = 0
    private var soundId5 = 0
    private var soundId6 = 0
    private var soundId7 = 0
    private var soundId8 = 0
    private var soundId9 = 0
    private var soundId10 = 0
    private var soundId11 = 0
    private var soundId12 = 0
    private var leftVolume = 1F
    private var rightVolume = 1F
    private var soundPriorityGlobal = 1



    fun playSound(sound: Int) {
        var soundIdBuffer = 0
        when (sound) {
            1 -> soundIdBuffer = soundId1
            2 -> soundIdBuffer = soundId2
            3 -> soundIdBuffer = soundId3
            4 -> soundIdBuffer = soundId4
            5 -> soundIdBuffer = soundId5
            6 -> soundIdBuffer = soundId6
            7 -> soundIdBuffer = soundId7
            8 -> soundIdBuffer = soundId8
            9 -> soundIdBuffer = soundId9
            10 -> soundIdBuffer = soundId10
            11 -> soundIdBuffer = soundId11
            12 -> soundIdBuffer = soundId12
        }

        soundPool?.play(soundIdBuffer, leftVolume, rightVolume, 0, 0, 1F)

    }


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            soundPool = SoundPool(25, AudioManager.STREAM_MUSIC, 0)
            soundId1 = soundPool!!.load(baseContext, R.raw.note_do, soundPriorityGlobal)
            soundId2 = soundPool!!.load(baseContext, R.raw.note_re, soundPriorityGlobal)
            soundId3 = soundPool!!.load(baseContext, R.raw.note_mi, soundPriorityGlobal)
            soundId4 = soundPool!!.load(baseContext, R.raw.note_fa, soundPriorityGlobal)
            soundId5 = soundPool!!.load(baseContext, R.raw.note_sol, soundPriorityGlobal)
            soundId6 = soundPool!!.load(baseContext, R.raw.note_lya, soundPriorityGlobal)
            soundId7 = soundPool!!.load(baseContext, R.raw.note_si, soundPriorityGlobal)



            findViewById<TextView>(R.id.key_do).setOnClickListener { playSound(1) }
            findViewById<TextView>(R.id.key_re).setOnClickListener { playSound(2) }
            findViewById<TextView>(R.id.key_mi).setOnClickListener { playSound(3) }
            findViewById<TextView>(R.id.key_fa).setOnClickListener { playSound(4) }
            findViewById<TextView>(R.id.key_sol).setOnClickListener { playSound(5) }
            findViewById<TextView>(R.id.key_lya).setOnClickListener { playSound(6) }
            findViewById<TextView>(R.id.key_si).setOnClickListener { playSound(7) }

        }
    }




