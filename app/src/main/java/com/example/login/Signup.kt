package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class Signup : AppCompatActivity() {
    lateinit var login:Button
    lateinit var name: TextInputEditText
    lateinit var username: TextInputEditText
    lateinit var email: TextInputEditText
    lateinit var password: TextInputEditText
    lateinit var sub: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        login=findViewById(R.id.login)
        name=findViewById(R.id.inputn)
        username=findViewById(R.id.inputusername)
        password=findViewById(R.id.inputpass)
        email=findViewById(R.id.inputemail)
        sub=findViewById(R.id.sub)
        sub.setOnClickListener {
            Toast.makeText(this, "DATA INSERTED", Toast.LENGTH_SHORT).show()

            var  datab=Database(this)
            datab.insertdata(name.text.toString(),username.text.toString(),email.text.toString(),password.text.toString())
        }
        login.setOnClickListener {
            var inte=Intent(this,Login::class.java)
            startActivity(inte)

        }

    }
}