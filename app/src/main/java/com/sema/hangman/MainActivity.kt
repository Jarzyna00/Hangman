package com.sema.hangman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Spinner
import com.google.android.material.floatingactionbutton.FloatingActionButton

//section Main Activity
class MainActivity : AppCompatActivity() {
    lateinit var stringArray: Array<String>

//    section onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stringArray = resources.getStringArray(R.array.words)
    }

    fun getRandomWord():String {
        val number = (0..stringArray.size).random()
        return stringArray[number]
    }
//    section onClick
    fun onClick(p0: FloatingActionButton?) {
        getRandomWord()
    }
}