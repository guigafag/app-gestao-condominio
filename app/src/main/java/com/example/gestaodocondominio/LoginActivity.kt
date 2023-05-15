package com.example.gestaodocondominio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AlertDialog

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val emailinput = findViewById<EditText>(R.id.emailinput)
        val senhainput = findViewById<EditText>(R.id.senhainput)
        val loginbutton = findViewById<Button>(R.id.loginbutton)

        loginbutton.setOnClickListener {
            val email = emailinput.text.toString()
            val senha = senhainput.text.toString()

            if (
                email == "bruno@gmail.com" && senha == "admin"
            ) {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)

            } else {
                val dialog = AlertDialog.Builder(this)
                dialog.setMessage("Senha Incorreta")
                dialog.show()
            }
        }

    }
}
