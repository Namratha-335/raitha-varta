package com.example.raitha_vrata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dashboard)

        val cropBtn = findViewById<Button>(R.id.btnCropTips)
        val expertBtn = findViewById<Button>(R.id.btnExpert)
        val successBtn = findViewById<Button>(R.id.btnSuccess)
        val pdfBtn = findViewById<Button>(R.id.btnPdf)
        val weatherBtn = findViewById<Button>(R.id.btnWeather)



        cropBtn.setOnClickListener {

                val intent = Intent(this, MainActivity::class.java)

                startActivity(intent)

        }

        expertBtn.setOnClickListener {

            startActivity(Intent(this, ExpertActivity::class.java))

        }

        successBtn.setOnClickListener {

            startActivity(Intent(this, SuccessStoryActivity::class.java))

        }

        pdfBtn.setOnClickListener {
            startActivity(Intent(this, PdfActivity::class.java))
        }

        weatherBtn.setOnClickListener {

            startActivity(
                Intent(this, WeatherActivity::class.java)
            )
        }

    }
}