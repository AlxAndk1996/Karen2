package com.example.karen2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registrarse = findViewById<TextView>(R.id.registro2)
        registrarse.setOnClickListener {
            val intent = Intent(this, registro::class.java)
            startActivity(intent)
        }

        val inicioAdmin = findViewById<Button>(R.id.inicioAdmin)
        inicioAdmin.setOnClickListener {
            val intent = Intent(this, loginAdmin::class.java)
            startActivity(intent)
        }
    }
}