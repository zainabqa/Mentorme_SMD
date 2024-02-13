package com.zainab.i200631

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Audiocall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audiocall)
    }

    fun gotobooksession(view: View) {

        val intent = Intent(this, BookSessions::class.java)
        startActivity(intent)

    }
}