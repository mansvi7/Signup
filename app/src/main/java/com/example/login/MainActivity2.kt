package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
     lateinit var txt:TextView
     lateinit var txtt:EditText
     lateinit var update:Button
     lateinit var delete:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        txt=findViewById(R.id.txt)
        txtt=findViewById(R.id.txtt)
        update=findViewById(R.id.update)
        delete=findViewById(R.id.delete)

        var name=intent.getIntExtra("namee",0)
        var user=intent.getStringExtra("userr").toString()

        txt.setText(name.toString())

        update.setOnClickListener {

            var up= Database(this)
            up.update(txtt.text.toString(),name)
        }
        delete.setOnClickListener {
            var del=Database(this)
            del.delete(name)
        }
    }
}