package com.example.healthcovidapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerHolder> {

    Context context;
    ArrayList<News> al_news;

    public HomeRecyclerAdapter(Context context, ArrayList<News> al_news) {
        this.context = context;
        this.al_news = al_news;
    }

    @NonNull
    @Override
    public HomeRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news, parent, false);
        return new HomeRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyclerHolder holder, int position) {
        holder.profile.setImageResource(al_news.get(position).getProfileImageID());
        holder.news.setImageResource(al_news.get(position).getNewsImageID());
        holder.title.setText(al_news.get(position).getTitle());
        holder.name.setText(al_news.get(position).getName());
        holder.time.setText(al_news.get(position).getTime().toString());
    }

    @Override
    public int getItemCount() {
        return al_news.size();
    }
}
