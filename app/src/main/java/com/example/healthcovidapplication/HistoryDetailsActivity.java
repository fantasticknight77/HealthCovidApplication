package com.example.healthcovidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HistoryDetailsActivity extends AppCompatActivity {

    TextView location, name, date, telephone, time;
    Button risk;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_details);
        back = findViewById(R.id.iv_hd_back);

        location = findViewById(R.id.tv_hd_locationInfo);
        name = findViewById(R.id.tv_hd_nameInfo);
        date = findViewById(R.id.tv_hd_dateInfo);
        telephone = findViewById(R.id.tv_hd_phoneInfo);
        time = findViewById(R.id.tv_hd_timeInfo);
        risk = findViewById(R.id.btn_risk);

        String stringLocation = getIntent().getExtras().getString("location");
        String stringName = getIntent().getExtras().getString("name");
        String stringDate = getIntent().getExtras().getString("date");
        String stringTelephone = getIntent().getExtras().getString("telephone");
        String stringTime = getIntent().getExtras().getString("time");
        String stringRisk = getIntent().getExtras().getString("risk");

        location.setText(stringLocation);
        name.setText(stringName);
        date.setText(stringDate);
        telephone.setText(stringTelephone);
        time.setText(stringTime);
        risk.setText(stringRisk);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryDetailsActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}