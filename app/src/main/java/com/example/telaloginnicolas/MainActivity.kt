package com.example.telaloginnicolas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login (view: View){
        val email = findViewById<EditText>(R.id.log_email).text.toString()
        val senha = findViewById<EditText>(R.id.log_senha).text.toString()

        if (email == "nicolas@hotmail.com" && senha == "abcd@1234"){
            Toast.makeText(context: this, email, Toast.LENGTH_SHORT).show("Logado com sucesso")
        }
    }
}