package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1,input2;
    TextView result;
    Button add,minus,times,divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input1);
        input2 =(EditText) findViewById(R.id.input2);
        result = (TextView) findViewById(R.id.result);
        add = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.minus);
        times = (Button) findViewById(R.id.times);
        divide = (Button) findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(input1.getText().toString());
                Double num2 = Double.parseDouble(input2.getText().toString());
                Double res = num1 + num2;

                result.setText(String.valueOf(res));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(input1.getText().toString());
                Double num2 = Double.parseDouble(input2.getText().toString());
                Double res = num1 - num2;

                result.setText(String.valueOf(res));
            }
        });
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(input1.getText().toString());
                Double num2 = Double.parseDouble(input2.getText().toString());
                Double res = num1 * num2;

                result.setText(String.valueOf(res));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(input1.getText().toString());
                Double num2 = Double.parseDouble(input2.getText().toString());
                Double res = num1 - num2;

                result.setText(String.valueOf(res));
            }
        });
    }
}