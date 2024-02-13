package com.zainab.i200631

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BookSessions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_sessions)
    }

    fun gotonoti(view: View) {

        val intent = Intent(this, Notifications::class.java)
        startActivity(intent)

    }
}