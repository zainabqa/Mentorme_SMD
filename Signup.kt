package com.zainab.i200631
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.text.Spanned
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.Button
import android.widget.TextView

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val btn=findViewById<Button>(R.id.signupbtn)
        btn.setOnClickListener {
            val intent= Intent(this,PhoneVerification::class.java)
            startActivity(intent)
        }
    }

    fun gobacktologin(view: View) {}


}