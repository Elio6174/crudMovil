package com.example.ed1_jorgesalinas_joelbailon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val botonCalculadora = findViewById<Button>(R.id.btnMenuCalculadora)
        val botonDB = findViewById<Button>(R.id.btnActivityDB)

        botonCalculadora.setOnClickListener {
            val intent = Intent(this, menuCalculadora::class.java)
            startActivity(intent)
        }

        botonDB.setOnClickListener {
            val intent = Intent(this, interfazMostrar::class.java)
            startActivity(intent)
        }
    }
}