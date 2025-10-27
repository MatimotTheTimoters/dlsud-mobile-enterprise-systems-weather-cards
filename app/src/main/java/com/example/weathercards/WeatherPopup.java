package com.example.weathercards;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherPopup extends AppCompatActivity {

    TextView tvCity, tvDate, tvTime, tvTemp, tvRFTemp;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather_popup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Get and assign IDs
        tvCity   = findViewById(R.id.tvCity);
        tvDate   = findViewById(R.id.tvDate);
        tvTime   = findViewById(R.id.tvTime);
        tvTemp   = findViewById(R.id.tvTemp);
        tvRFTemp = findViewById(R.id.tvRFTemp);
        btnReturn = findViewById(R.id.btnReturn);

        // Unbox intent
        Intent intent = getIntent();
        String city = intent.getStringExtra("city");
        String date = intent.getStringExtra("date");
        String time = intent.getStringExtra("time");
        String temp = intent.getStringExtra("temp");
        String rfTemp = intent.getStringExtra("rfTemp");

        // Assign intent values to views
        tvCity.setText(city != null ? city : "[no city]");
        tvDate.setText(date != null ? date : "[no date]");
        tvTime.setText(time != null ? time : "[no time]");
        tvTemp.setText(temp != null ? temp : "[no temperature]");
        tvRFTemp.setText(rfTemp != null ? rfTemp : "[no realfeel]");

        // RETURN button closes the popup
        btnReturn.setOnClickListener(v -> finish());
    }
}