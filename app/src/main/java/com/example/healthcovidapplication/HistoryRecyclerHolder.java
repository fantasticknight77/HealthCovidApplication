package com.example.healthcovidapplication;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HistoryRecyclerHolder extends RecyclerView.ViewHolder {

    TextView location, time;
    Context context;
    ArrayList<History> al_history;

    public HistoryRecyclerHolder(@NonNull View itemView) {
        super(itemView);

        location = itemView.findViewById(R.id.tv_history_location);
        time = itemView.findViewById(R.id.tv_history_time);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HistoryDetailsActivity.class);
                int position = getAdapterPosition();
                intent.putExtra("name",al_history.get(position).getName());
                intent.putExtra("location",al_history.get(position).getLocation());
                intent.putExtra("telephone",al_history.get(position).getTelephone());
                intent.putExtra("risk",al_history.get(position).getRisk());
                intent.putExtra("date",al_history.get(position).getDate().toString());
                intent.putExtra("time",al_history.get(position).getTime().toString());
                context.startActivity(intent);
            }
        });
    }
}
