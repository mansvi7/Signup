package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var signup:Button
    lateinit var log:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signup=findViewById(R.id.sign)
        log=findViewById(R.id.log)
        signup.setOnClickListener {
            var intee=Intent(this,Signup::class.java)
            startActivity(intee)
        }
        log.setOnClickListener {
            var inte = Intent(this, Login::class.java)
            startActivity(inte)
        }
    }
}