package com.example.swappercheckermartinez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Text1 = findViewById(R.id.Text1);
        EditText Text2 = findViewById(R.id.Text2);
        Button btnSwap = findViewById(R.id.btnSwap);
        Button btnCheck = findViewById(R.id.btnCheck);

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = Text1.getText().toString();
                String text2 = Text2.getText().toString();

                Text1.setText(text2);
                Text2.setText(text1);
            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = Text1.getText().toString();
                String text2 = Text2.getText().toString();

                String Message = "";
                if (text1.equals(text2)) {
                    Message = "SAME";
                }
                else{
                    Message = "NOT THE SAME";
                }
                Intent intent = new Intent(MainActivity.this, MyMessage.class);
                intent.putExtra("result", Message);
                startActivity(intent);
            }
        });
    }
}