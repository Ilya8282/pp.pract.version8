package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
    fun btn1 (View: View) {
        val intent = Intent(this@MainActivity2,
            MainActivity3::class.java)
        startActivity(intent)
    }
    fun btn2 (View: View) {
        val intent = Intent(this@MainActivity2,
            MainActivity4::class.java)
        startActivity(intent)
    }

    fun btn4 (View: View) {
        val intent = Intent(this@MainActivity2,
            MainActivity6::class.java)
        startActivity(intent)
    }
    fun exit2 (View: View) {
        finishAffinity()
        System.exit(0)
    }


}