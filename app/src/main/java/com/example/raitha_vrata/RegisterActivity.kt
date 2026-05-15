package com.example.raitha_vrata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register)

        val continueButton = findViewById<Button>(R.id.btnContinue)

        continueButton.setOnClickListener {

            val intent = Intent(this, DashboardActivity::class.java)

            startActivity(intent)

        }
    }
}