package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DateOfBirthActivity extends AppCompatActivity {
    public String[] dates = {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    public String[] months = {"Select", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public String[] years = {"Select", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014","2015","2016","2017", "2018", "2019" };
    ArrayAdapter arrayAdapter;
    Spinner dateSp;
    Spinner monthSp;
    Spinner yearSp;
    Button submitDobBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        initViews();
        setDateAdapter();
        connectAdapter();
        setMonthAdapter();
        connectMonthAdapter();
        setYearsAdapter();
        connectYearsAdapter();
    }
    public void initViews(){
      dateSp = findViewById(R.id.date_sp);
      monthSp = findViewById(R.id.month_sp);
      yearSp = findViewById(R.id.year_sp);
      submitDobBtn = findViewById(R.id.dob_submit_btn);
    }

    public void setDateAdapter(){
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,dates);
    }

    public void connectAdapter(){
        dateSp.setAdapter(arrayAdapter);
    }

    public void setMonthAdapter(){
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,months);
    }

    public void connectMonthAdapter(){
        monthSp.setAdapter(arrayAdapter);
    }

    public void setYearsAdapter(){
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,years);
    }

    public void connectYearsAdapter(){
        yearSp.setAdapter(arrayAdapter);
    }
}