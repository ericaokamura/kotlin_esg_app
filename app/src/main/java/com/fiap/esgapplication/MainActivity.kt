package com.fiap.esgapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = getIntent();
        val usuario = intent.getStringExtra("usuario")

        val txtUsuario = findViewById<TextView>(R.id.textView4)
        txtUsuario.text = "Seja bem-vindo(a) " + usuario + "!"


    }

}
