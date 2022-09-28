package com.example.healthcovidapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class HomeRecyclerHolder extends RecyclerView.ViewHolder {

    TextView name, time, title;
    ImageView profile, news;

    public HomeRecyclerHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.tv_news_name);
        time = itemView.findViewById(R.id.tv_news_time);
        title = itemView.findViewById(R.id.tv_news_title);
        profile = itemView.findViewById(R.id.iv_news_logo);
        news = itemView.findViewById(R.id.iv_news_picture);
    }
}
