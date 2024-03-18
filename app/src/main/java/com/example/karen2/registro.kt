package com.example.karen2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val inicio = findViewById<TextView>(R.id.registro2)
        inicio.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val inicioAdmin = findViewById<Button>(R.id.registroAdmin)
        inicioAdmin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}