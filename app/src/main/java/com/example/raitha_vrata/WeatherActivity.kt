package com.example.raitha_vrata

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val txtWeather = findViewById<TextView>(R.id.txtWeather)
        val txtTip = findViewById<TextView>(R.id.txtTip)

        val btnSunny = findViewById<Button>(R.id.btnSunny)
        val btnRainy = findViewById<Button>(R.id.btnRainy)
        val btnCloudy = findViewById<Button>(R.id.btnCloudy)

        btnSunny.setOnClickListener {

            txtWeather.text = "☀️ Sunny Weather / ಬಿಸಿಲಿನ ಹವಾಮಾನ"

            txtTip.text =
                "• Water crops twice daily\n" +
                        "• ದಿನಕ್ಕೆ ಎರಡು ಬಾರಿ ಬೆಳೆಗಳಿಗೆ ನೀರು ಹಾಕಿ\n\n" +

                        "• Use shade for small plants\n" +
                        "• ಸಣ್ಣ ಗಿಡಗಳಿಗೆ ನೆರಳು ಒದಗಿಸಿ\n\n" +

                        "• Avoid fertilizer in high heat\n" +
                        "• ಹೆಚ್ಚು ಬಿಸಿಯಲ್ಲಿ ರಸಗೊಬ್ಬರ ಬಳಸಬೇಡಿ"
        }

        btnRainy.setOnClickListener {

            txtWeather.text = "🌧️ Rainy Weather / ಮಳೆಯ ಹವಾಮಾನ"

            txtTip.text =
                "• Avoid water stagnation\n" +
                        "• ನೀರು ನಿಲ್ಲದಂತೆ ನೋಡಿಕೊಳ್ಳಿ\n\n" +

                        "• Spray neem oil weekly\n" +
                        "• ವಾರಕ್ಕೊಮ್ಮೆ ನೀಮ್ ಎಣ್ಣೆ ಸಿಂಪಡಿಸಿ\n\n" +

                        "• Protect crops from fungus\n" +
                        "• ಬೆಳೆಗಳನ್ನು ಹುಳು ಮತ್ತು ಶಿಲೀಂಧ್ರದಿಂದ ರಕ್ಷಿಸಿ"
        }

        btnCloudy.setOnClickListener {

            txtWeather.text = "☁️ Cloudy Weather / ಮೋಡದ ಹವಾಮಾನ"

            txtTip.text =
                "• Monitor soil moisture\n" +
                        "• ಮಣ್ಣಿನ ತೇವಾಂಶ ಪರಿಶೀಲಿಸಿ\n\n" +

                        "• Check pest growth\n" +
                        "• ಕೀಟಗಳ ಬೆಳವಣಿಗೆ ಗಮನಿಸಿ\n\n" +

                        "• Use balanced irrigation\n" +
                        "• ಸಮತೋಲನ ನೀರಾವರಿ ಬಳಸಿ"
        }
    }
}
