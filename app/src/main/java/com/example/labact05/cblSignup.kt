package com.example.labact05

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cblSignup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.cbl_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val usernameDisplay: EditText = findViewById(R.id.cbl_usernameinput)
        val emailDisplay: EditText = findViewById(R.id.cbl_emailinput)
        val nameDisplay: EditText = findViewById(R.id.cbl_nameinput)
        val ageDisplay: EditText = findViewById(R.id.cbl_ageinput)
        val signup: Button = findViewById(R.id.cbl_signup)


        signup.setOnClickListener {

            val intent = Intent(this, cblProfileDisplay::class.java)

            intent.putExtra("Name", nameDisplay.text.toString())
            intent.putExtra("Username", usernameDisplay.text.toString())
            intent.putExtra("Age", ageDisplay.text.toString())
            intent.putExtra("Email", emailDisplay.text.toString())

            startActivity(intent)
        }
    }
}