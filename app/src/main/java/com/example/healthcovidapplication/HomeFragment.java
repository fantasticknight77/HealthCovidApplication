package com.example.healthcovidapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    HomeRecyclerAdapter home_Adapter;

    ArrayList<News> al_news;

    ImageView status, faqs;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        status = v.findViewById(R.id.iv_home_status);
        faqs = v.findViewById(R.id.iv_home_faqs);

        recyclerView = v.findViewById(R.id.rv_home);
        al_news = getArrayList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        home_Adapter = new HomeRecyclerAdapter(getActivity(),al_news);
        recyclerView.setAdapter(home_Adapter);

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), StatusActivity.class);
                startActivity(intent);
            }
        });

        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FrequentlyAskQuestionsActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }

    public ArrayList<News> getArrayList() {
        ArrayList<News> arrayList = new ArrayList<>();

        arrayList.add(new News(R.drawable.logo_baru_kkm,
                R.drawable.thingstoknow,
                "CPRC KKM",
                "COVID-19 IN MALAYSIA AS OF 4 MAY 2021",
                new Timestamp(2021,5,4,5,37,23,10)));

        arrayList.add(new News(R.drawable.logo_baru_kkm,
                R.drawable.thingstoknow,
                "CPRC KKM",
                "COVID-19 IN MALAYSIA AS OF 4 MAY 2021",
                new Timestamp(2021,5,4,5,37,23,10)));

        return arrayList;
    }
}