package com.example.weathercards;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvLocationManila, tvLocationDasma, tvLocationCebu, tvLocationDavao,
            tvManilaDate, tvDasmaDate, tvCebuDate, tvDavaoDate,
            tvManilaTime, tvDasmaTime, tvCebuTime, tvDavaoTime,
            tvManilaTemp, tvDasmaTemp, tvCebuTemp, tvDavaoTemp,
            tvManilaRFTemp, tvDasmaRFTemp, tvCebuRFTemp, tvDavaoRFTemp;
    CardView cvManila, cvDasma, cvCebu, cvDavao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Bind views
        getViewIDs();

        // Set click listeners for each card
        cvManila.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WeatherPopup.class);
            intent.putExtra("city", tvLocationManila.getText().toString());
            intent.putExtra("date", tvManilaDate.getText().toString());
            intent.putExtra("time", tvManilaTime.getText().toString());
            intent.putExtra("temp", tvManilaTemp.getText().toString());
            intent.putExtra("rfTemp", tvManilaRFTemp.getText().toString());

            // Also send the original view resource IDs (int) if you want to reference these later
            intent.putExtra("id_city", R.id.tvLocationManila);
            intent.putExtra("id_date", R.id.tvManilaDate);
            intent.putExtra("id_time", R.id.tvManilaTime);
            intent.putExtra("id_temp", R.id.tvManilaTemp);
            intent.putExtra("id_rfTemp", R.id.tvManilaRFTemp);

            startActivity(intent);
        });

        cvDasma.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WeatherPopup.class);
            intent.putExtra("city", tvLocationDasma.getText().toString());
            intent.putExtra("date", tvDasmaDate.getText().toString());
            intent.putExtra("time", tvDasmaTime.getText().toString());
            intent.putExtra("temp", tvDasmaTemp.getText().toString());
            intent.putExtra("rfTemp", tvDasmaRFTemp.getText().toString());

            intent.putExtra("id_city", R.id.tvLocationDasma);
            intent.putExtra("id_date", R.id.tvDasmaDate);
            intent.putExtra("id_time", R.id.tvDasmaTime);
            intent.putExtra("id_temp", R.id.tvDasmaTemp);
            intent.putExtra("id_rfTemp", R.id.tvDasmaRFTemp);

            startActivity(intent);
        });

        cvCebu.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WeatherPopup.class);
            intent.putExtra("city", tvLocationCebu.getText().toString());
            intent.putExtra("date", tvCebuDate.getText().toString());
            intent.putExtra("time", tvCebuTime.getText().toString());
            intent.putExtra("temp", tvCebuTemp.getText().toString());
            intent.putExtra("rfTemp", tvCebuRFTemp.getText().toString());

            intent.putExtra("id_city", R.id.tvLocationCebu);
            intent.putExtra("id_date", R.id.tvCebuDate);
            intent.putExtra("id_time", R.id.tvCebuTime);
            intent.putExtra("id_temp", R.id.tvCebuTemp);
            intent.putExtra("id_rfTemp", R.id.tvCebuRFTemp);

            startActivity(intent);
        });

        cvDavao.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WeatherPopup.class);
            intent.putExtra("city", tvLocationDavao.getText().toString());
            intent.putExtra("date", tvDavaoDate.getText().toString());
            intent.putExtra("time", tvDavaoTime.getText().toString());
            intent.putExtra("temp", tvDavaoTemp.getText().toString());
            intent.putExtra("rfTemp", tvDavaoRFTemp.getText().toString());

            intent.putExtra("id_city", R.id.tvLocationDavao);
            intent.putExtra("id_date", R.id.tvDavaoDate);
            intent.putExtra("id_time", R.id.tvDavaoTime);
            intent.putExtra("id_temp", R.id.tvDavaoTemp);
            intent.putExtra("id_rfTemp", R.id.tvDavaoRFTemp);

            startActivity(intent);
        });
    }

    public void getViewIDs() {
        // Location TextViews
        tvLocationManila = findViewById(R.id.tvLocationManila);
        tvLocationDasma = findViewById(R.id.tvLocationDasma);
        tvLocationCebu   = findViewById(R.id.tvLocationCebu);
        tvLocationDavao  = findViewById(R.id.tvLocationDavao);

        // Date TextViews
        tvManilaDate = findViewById(R.id.tvManilaDate);
        tvDasmaDate  = findViewById(R.id.tvDasmaDate);
        tvCebuDate   = findViewById(R.id.tvCebuDate);
        tvDavaoDate  = findViewById(R.id.tvDavaoDate);

        // Time TextViews
        tvManilaTime = findViewById(R.id.tvManilaTime);
        tvDasmaTime  = findViewById(R.id.tvDasmaTime);
        tvCebuTime   = findViewById(R.id.tvCebuTime);
        tvDavaoTime  = findViewById(R.id.tvDavaoTime);

        // Temp TextViews
        tvManilaTemp = findViewById(R.id.tvManilaTemp);
        tvDasmaTemp  = findViewById(R.id.tvDasmaTemp);
        tvCebuTemp   = findViewById(R.id.tvCebuTemp);
        tvDavaoTemp  = findViewById(R.id.tvDavaoTemp);

        // RealFeel TextViews
        tvManilaRFTemp = findViewById(R.id.tvManilaRFTemp);
        tvDasmaRFTemp  = findViewById(R.id.tvDasmaRFTemp);
        tvCebuRFTemp   = findViewById(R.id.tvCebuRFTemp);
        tvDavaoRFTemp  = findViewById(R.id.tvDavaoRFTemp);

        // CardViews
        cvManila = findViewById(R.id.cvManila);
        cvDasma  = findViewById(R.id.cvDasma);
        cvCebu   = findViewById(R.id.cvCebu);
        cvDavao  = findViewById(R.id.cvDavao);
    }
}
