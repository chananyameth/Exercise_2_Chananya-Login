package com.example.gidi7.loginchananya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView text = (TextView)findViewById(R.id.Text);
        text.setText("Hello " + getIntent().getStringExtra("usernametext"));
    }
}
