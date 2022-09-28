package com.example.healthcovidapplication;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FAQRecyclerHolder extends RecyclerView.ViewHolder {

    TextView question, answer;

    public FAQRecyclerHolder(@NonNull View itemView) {
        super(itemView);

        question = itemView.findViewById(R.id.tv_faq_question);
        answer = itemView.findViewById(R.id.tv_faq_answer);
    }
}