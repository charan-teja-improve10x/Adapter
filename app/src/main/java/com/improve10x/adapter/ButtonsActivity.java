package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonsActivity extends AppCompatActivity {
    Button luckyNumberBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        initViews();
        handleLuckyNumberBtn();
    }

    public void initViews() {
        luckyNumberBtn = findViewById(R.id.lucky_number_btn);
    }

    public void handleLuckyNumberBtn() {
        luckyNumberBtn.setOnClickListener(view -> {
            navigateToLuckyNumberActivity();
        });
    }

    public void navigateToLuckyNumberActivity() {
        Intent luckyNumberActivityIntent = new Intent(this, LuckyNumberActivity.class);
        startActivity(luckyNumberActivityIntent);
    }
}