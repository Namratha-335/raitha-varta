package com.example.raitha_vrata

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PdfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        val pdfBtn = findViewById<Button>(R.id.btnUploadPdf)

        val longTitle = findViewById<TextView>(R.id.txtLongTitle)
        val longBox = findViewById<TextView>(R.id.txtLong)

        val processingText = findViewById<TextView>(R.id.txtProcessing)

        val kannadaTitle = findViewById<TextView>(R.id.txtKannadaTitle)
        val kannadaBox = findViewById<TextView>(R.id.txtKannada)

        pdfBtn.setOnClickListener {

            longTitle.visibility = View.VISIBLE
            longBox.visibility = View.VISIBLE
            processingText.visibility = View.VISIBLE

            Handler(Looper.getMainLooper()).postDelayed({

                processingText.visibility = View.GONE

                kannadaTitle.visibility = View.VISIBLE
                kannadaBox.visibility = View.VISIBLE

            }, 2000)
        }
    }
}
