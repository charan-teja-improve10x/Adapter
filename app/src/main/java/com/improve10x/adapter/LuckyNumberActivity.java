package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class LuckyNumberActivity extends AppCompatActivity {
    public String[] numbers = {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",};
    ArrayAdapter adapter;
    Spinner numbersSp;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        initViews();
        setAdapter();
        connectAdapter();
    }
    public void initViews(){
        numbersSp = findViewById(R.id.numbers_sp);
        submitBtn = findViewById(R.id.submit_btn);
    }
    public void setAdapter(){
        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, numbers);
    }
    public void connectAdapter() {
        numbersSp.setAdapter(adapter);
    }
}