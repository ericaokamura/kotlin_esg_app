package com.fiap.esgapplication

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnOk = findViewById<Button>(R.id.button)
        val edtUsuario = findViewById<EditText>(R.id.editText)
        val edtSenha = findViewById<EditText>(R.id.editText2)

        btnOk.setOnClickListener {
            if (TextUtils.isEmpty(edtUsuario.editableText.toString())) {
                Toast.makeText(this, "Campo Usuário é obrigatório!", Toast.LENGTH_LONG).show()
                edtUsuario.setError("Campo Usuário é obrigatório!")
                if (TextUtils.isEmpty(edtSenha.editableText.toString())) {
                    Toast.makeText(this, "Campo Senha é obrigatório!", Toast.LENGTH_LONG).show()
                    edtSenha.setError("Campo Senha é obrigatório!")
                }
            } else {
                if (TextUtils.isEmpty(edtSenha.editableText.toString())) {
                    Toast.makeText(this, "Campo Senha é obrigatório!", Toast.LENGTH_LONG).show()
                    edtSenha.setError("Campo Senha é obrigatório!")
                } else {
                    val sendIntent = Intent(this, MainActivity::class.java)
                    sendIntent.action = Intent.ACTION_SEND
                    sendIntent.putExtra("usuario", edtUsuario.editableText.toString())
                    sendIntent.type = "text/plain"
                    startActivity(sendIntent)
                }
            }
        }
    }
}