package com.example.healthcovidapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CheckInFragment extends Fragment {

    private TextView history;
    private Button checkin;

    public CheckInFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_check_in, container, false);
        history = v.findViewById(R.id.tv_checkin_history);
        checkin = v.findViewById(R.id.btn_checkin);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),HistoryActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }
}