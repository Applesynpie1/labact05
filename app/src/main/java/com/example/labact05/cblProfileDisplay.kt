package com.example.labact05

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cblProfileDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.cbl_displayprofile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nameDisplay: TextView = findViewById(R.id.cbl_namedisplay)
        val userDisplay: TextView = findViewById(R.id.cbl_userdisplay)
        val ageDisplay: TextView = findViewById(R.id.cbl_agedisplay)
        val emailDisplay: TextView = findViewById(R.id.cbl_emaildisplay)

        val name = intent.getStringExtra("Name")
        val username = intent.getStringExtra("Username")
        val age = intent.getStringExtra("Age")
        val email = intent.getStringExtra("Email")

        nameDisplay.text = name
        userDisplay.text = "@" + username
        ageDisplay.text = "Age: " + age
        emailDisplay.text = email
    }
}