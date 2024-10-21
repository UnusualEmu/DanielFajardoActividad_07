package com.example.loginactividad07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los elementos en el layout
        val boton = findViewById<Button>(R.id.boton1)
        val userText = findViewById<EditText>(R.id.id_user)
        val password = findViewById<EditText>(R.id.id_password)

        // Acción del botón al hacer click
        boton.setOnClickListener {
            // Obtener los textos de los EditTexts
            val username = userText.text.toString()
            val userPassword = password.text.toString()

            // Mostrar en Logcat
            Log.d("MainActivity", "Username: $username")
            Log.d("MainActivity", "Password: $userPassword")

            // Mostrar en Toast
            Toast.makeText(this, "Usuario: $username, Contraseña: $userPassword", Toast.LENGTH_LONG).show()
        }
    }
}
