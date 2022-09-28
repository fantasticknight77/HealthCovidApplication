package com.example.healthcovidapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class FrequentlyAskQuestionsActivity extends AppCompatActivity {

    private ImageView back;
    RecyclerView recyclerView;
    FAQRecyclerAdapter faq_Adapter;

    ArrayList<FrequentlyAskQuestion> al_faqs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequently_ask_questions);

        recyclerView = findViewById(R.id.rv_faq);
        al_faqs = getArrayList();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        faq_Adapter = new FAQRecyclerAdapter(this,al_faqs);
        recyclerView.setAdapter(faq_Adapter);

        back = findViewById(R.id.iv_faq_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrequentlyAskQuestionsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public ArrayList<FrequentlyAskQuestion> getArrayList() {
        ArrayList<FrequentlyAskQuestion> arrayList = new ArrayList<>();

        arrayList.add(new FrequentlyAskQuestion("What is coronavirus?",
                "Coronavirus (CoV) is a virus that can cause respiratory tract infections. " +
                        "There are several types of coronavirus such as severe acute respiratory syndrome coronavirus (SARS) and Middle East Respiratory syndrome-related coronavirus (MER-CoV). " +
                        "The latest Coronavirus found in China is Novel Coronavirus 2019 (COVID-19)."));
        arrayList.add(new FrequentlyAskQuestion("How novel coronavirus 2019 (COVID-19) spread?",
                "Mode of transmission of novel coronavirus COVID-19 from individuals is via droplets from the nose or mouth when someone with COVID- 19 coughed or sneezed. " +
                        "It spreads across objects and surfaces around it. Other people get COVID-19 infection by touching this object or surface, then touching their eyes, nose or mouth. " +
                        "A person may also be infected with COVID-19 if they are in close contact with a COVID-19 patient who is coughing or sneezing or releasing a droplets. " +
                        "That's why it's important to maintain a distance of more than 1 meter (3 feet) from a sick person.\n\n" +
                        "MOH is currently monitoring the progress of this infection and the situation is changing and will update the disease information on the MOH website from time to time. " +
                        "People are advised to be vigilant and to maintain good personal hygiene."));

        return  arrayList;
    }
}