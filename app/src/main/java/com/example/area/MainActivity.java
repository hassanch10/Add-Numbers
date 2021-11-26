package com.example.area;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText number1;
        EditText number2;
        Button Add_button;
        TextView result;
        // by ID we can use each component which id is assign in xml file
        number1 = findViewById(R.id.editText_first_no);
        number2 = findViewById(R.id.editText_second_no);
        Add_button = findViewById(R.id.add_button);
        result = findViewById(R.id.textView_answer);


        Add_button.setOnClickListener(v -> {

            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());

            double sum = num1 + num2;

            result.setText(Double.toString(sum));
        });
    }
}