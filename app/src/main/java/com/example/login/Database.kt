package com.example.login

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Database(context: Context):SQLiteOpenHelper(context,"data.db",null,1) {
    override fun onCreate(p0: SQLiteDatabase) {
       var create="CREATE TABLE mytable (id INTEGER PRIMARY Key autoincrement,name text UNIQUE,username text UNIQUE ,email text UNIQUE,password text UNIQUE)"
        p0.execSQL(create)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun insertdata(name:String,username:String,email:String,password:String) {
        var insert =
            "INSERT INTO mytable(name,username,email,password) VALUES('$name','$username','$email','$password')"
        try {
            writableDatabase.execSQL(insert)
        } catch (e: Exception) {
        }
    }

    fun select(username:String,password: String): Cursor {
        var select="SELECT * FROM mytable WHERE username= '$username' AND password= '$password' "
        var cursor : Cursor
        cursor= readableDatabase.rawQuery(select,null)

        return cursor
    }
    fun update(username: String, id: Int) {
         var updatee="UPDATE mytable SET username='$username' WHERE id='$id'"
        try {
            writableDatabase.execSQL(updatee)
        } catch (e: Exception) {
        }
    }
      fun delete(id: Int) {
          var d="DELETE FROM mytable WHERE id='$id'";
          try {
              writableDatabase.execSQL(d)
          } catch (e: Exception) {
          }
}

}
