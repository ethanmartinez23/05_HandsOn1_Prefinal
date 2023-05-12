package com.example.swappercheckermartinez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_message);

        TextView result = findViewById(R.id.result);
        Intent intent = getIntent();
        String Message = intent.getStringExtra("result");
        result.setText(Message);
    }
}
