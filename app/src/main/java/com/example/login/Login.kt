package com.example.login

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class Login : AppCompatActivity() {
    lateinit var sign:Button
    lateinit var usern:TextInputEditText
    lateinit var pv: TextInputEditText
    lateinit var login: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        sign=findViewById(R.id.sign)
        usern=findViewById(R.id.usern)
        pv=findViewById(R.id.pv)
        login=findViewById(R.id.login)

        login.setOnClickListener {
            var ab = 0
            var selectt = Database(this)
            var data: Cursor
            data = selectt.select(usern.text.toString(), pv.text.toString())
            while (data.moveToNext()) {

                ab = data.getInt(0)

            }
            startActivity(Intent(this, MainActivity2::class.java).putExtra("namee", ab).putExtra("userr",usern.text.toString()))
            finish()
        }
        sign.setOnClickListener {
            var inte=Intent(this,MainActivity::class.java)
            startActivity(inte)
        }
    }
}