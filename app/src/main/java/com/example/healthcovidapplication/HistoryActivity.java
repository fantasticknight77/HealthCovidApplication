package com.example.healthcovidapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class HistoryActivity extends AppCompatActivity {

    ImageView back;

    RecyclerView recyclerView;
    HistoryRecyclerAdapter history_Adapter;

    ArrayList<History> al_history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        back = findViewById(R.id.iv_history_back);

        recyclerView = findViewById(R.id.rv_history);
        al_history = getArrayList();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        history_Adapter = new HistoryRecyclerAdapter(this,al_history);
        recyclerView.setAdapter(history_Adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public ArrayList<History> getArrayList() {
        ArrayList<History> arrayList = new ArrayList<>();

       arrayList.add(new History("Jason Ong",
               "Restoran Season",
               "+60123456789",
               "Low",
               new Date(2021,4, 21),
               new Time(8, 29, 34)));

        arrayList.add(new History("Jason Ong",
                "Restoran Wang Wang",
                "+60123456789",
                "Low",
                new Date(2021,4, 20),
                new Time(8, 29, 34)));

        arrayList.add(new History("Jason Ong",
                "Restoran News",
                "+60123456789",
                "Low",
                new Date(2021,4, 19),
                new Time(8, 29, 34)));

        return  arrayList;
    }
}