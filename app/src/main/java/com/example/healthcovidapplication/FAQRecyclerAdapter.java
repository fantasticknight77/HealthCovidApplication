package com.example.healthcovidapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FAQRecyclerAdapter extends RecyclerView.Adapter<FAQRecyclerHolder> {

    Context context;
    ArrayList<FrequentlyAskQuestion> al_faqs;

    public FAQRecyclerAdapter(Context context, ArrayList<FrequentlyAskQuestion> al_faqs) {
        this.context = context;
        this.al_faqs = al_faqs;
    }

    @NonNull
    @Override
    public FAQRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.frequently_ask_question, parent, false);
        return new FAQRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FAQRecyclerHolder holder, int position) {

        holder.question.setText(al_faqs.get(position).getQuestion());
        holder.answer.setText(al_faqs.get(position).getAnswer());
    }

    @Override
    public int getItemCount() {
        return al_faqs.size();
    }
}
