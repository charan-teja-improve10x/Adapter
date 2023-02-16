package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class LocationActivity extends AppCompatActivity {
    public String[] states = {"select", "Andhra Pradesh", "Telangana", "Karnataka", "Kerala", "Madhya Pradesh", "Gujarat", "Bihar", "Assam", "Chhattisgarh"};
    ArrayAdapter arrayAdapter;
    Spinner locationSp;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        initViews();
        setAdapter();
        connectAdapter();
    }

    public void initViews() {
        locationSp = findViewById(R.id.location_sp);
        submitBtn = findViewById(R.id.location_submit_btn);
    }

    public void setAdapter() {
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, states);
    }

    public void connectAdapter() {
        locationSp.setAdapter(arrayAdapter);
    }
}