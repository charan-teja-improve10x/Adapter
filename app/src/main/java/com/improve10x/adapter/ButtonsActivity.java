package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonsActivity extends AppCompatActivity {
    Button luckyNumberBtn;
    Button locationBtn;
    Button dOBBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        initViews();
        handleLuckyNumberBtn();
        handleLocationBtn();
        handleDateOfBirthBtn();
    }

    public void initViews() {
        luckyNumberBtn = findViewById(R.id.lucky_number_btn);
        locationBtn = findViewById(R.id.location_btn);
        dOBBtn = findViewById(R.id.dob_btn);
    }

    public void handleLuckyNumberBtn() {
        luckyNumberBtn.setOnClickListener(view -> {
            navigateToLuckyNumberActivity();
        });
    }

    public void handleLocationBtn(){
        locationBtn.setOnClickListener(v -> {
         navigateToLocationActivity();
        });
    }

    public void handleDateOfBirthBtn(){
        dOBBtn.setOnClickListener(v -> {
            navigateToDateOfBirthActivity();
        });
    }

    public void navigateToLuckyNumberActivity() {
        Intent luckyNumberActivityIntent = new Intent(this, LuckyNumberActivity.class);
        startActivity(luckyNumberActivityIntent);
    }

    public void navigateToLocationActivity(){
        Intent locationActivityIntent = new Intent(this,LocationActivity.class);
        startActivity(locationActivityIntent);
    }
    public void navigateToDateOfBirthActivity(){
        Intent dateOfBirthIntent = new Intent(this,DateOfBirthActivity.class);
        startActivity(dateOfBirthIntent);
    }
}