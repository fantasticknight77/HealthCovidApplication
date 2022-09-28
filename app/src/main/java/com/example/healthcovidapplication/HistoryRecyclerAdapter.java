package com.example.healthcovidapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HistoryRecyclerAdapter extends RecyclerView.Adapter<HistoryRecyclerHolder> {

    Context context;
    ArrayList<History> al_history;

    public HistoryRecyclerAdapter(Context context, ArrayList<History> al_history) {
        this.context = context;
        this.al_history = al_history;
    }

    @NonNull
    @Override
    public HistoryRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.history, parent, false);
        return new HistoryRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryRecyclerHolder holder, int position) {

        String location = "Check-in at "+al_history.get(position).getLocation();
        holder.location.setText(location);
        holder.time.setText(al_history.get(position).getDate().toString());
        holder.context = this.context;
        holder.al_history = this.al_history;
    }

    @Override
    public int getItemCount() {
        return al_history.size();
    }
}
