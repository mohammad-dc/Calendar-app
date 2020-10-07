package com.example.calendertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private TextView dateView;
    private Button btnGoCalender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateView = findViewById(R.id.date);
        btnGoCalender = findViewById(R.id.btn_go_calender);

        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra("date");
        dateView.setText(date);
        btnGoCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalenderActivity.class);
                startActivity(intent);
            }
        });
    }
}