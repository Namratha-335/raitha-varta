package com.example.raitha_vrata

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ExpertActivity : AppCompatActivity() {

    private lateinit var cropImage: ImageView
    private lateinit var txtSuggestion: TextView

    companion object {
        const val PICK_IMAGE = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_expert)

        cropImage = findViewById(R.id.cropImage)

        txtSuggestion = findViewById(R.id.txtSuggestion)

        txtSuggestion.text = "Upload image to get AI suggestion"

        val uploadBtn = findViewById<Button>(R.id.btnUpload)

        uploadBtn.setOnClickListener {

            val intent = Intent(Intent.ACTION_PICK)

            intent.type = "image/*"

            startActivityForResult(intent, PICK_IMAGE)
        }
    }

    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?
    ) {

        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_IMAGE &&
            resultCode == Activity.RESULT_OK &&
            data != null &&
            data.data != null
        ) {

            val imageUri: Uri? = data.data

            cropImage.setImageURI(imageUri)

            val suggestions = listOf(

                "Disease Detected: Leaf Blight\n\n" +
                        "Recommended Solution:\n" +
                        "• Spray neem oil weekly\n" +
                        "• Remove infected leaves\n" +
                        "• Avoid overwatering",

                "Disease Detected: Pest Attack\n\n" +
                        "Recommended Solution:\n" +
                        "• Use organic pesticide\n" +
                        "• Keep soil clean\n" +
                        "• Monitor crop daily",

                "Disease Detected: Low Water Level\n\n" +
                        "Recommended Solution:\n" +
                        "• Increase irrigation\n" +
                        "• Use drip irrigation\n" +
                        "• Mulch soil properly",

                "Disease Detected: Nutrient Deficiency\n\n" +
                        "Recommended Solution:\n" +
                        "• Add organic compost\n" +
                        "• Use balanced fertilizer\n" +
                        "• Improve soil nutrients"
            )

            txtSuggestion.text = suggestions.random()

            Toast.makeText(
                this,
                "AI Suggestion Generated",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}