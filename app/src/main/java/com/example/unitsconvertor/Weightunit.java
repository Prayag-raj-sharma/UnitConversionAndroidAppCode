package com.example.unitsconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Weightunit extends AppCompatActivity {

    Button sp1 ,sp2,sp3,sp4;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widthunit);

        ed1 = findViewById(R.id.value);
        sp1 = findViewById(R.id.PToKg);
        sp2 = findViewById(R.id.KgToP);
        sp3 = findViewById(R.id.GToP);
        sp4 = findViewById(R.id.PToG);

        sp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number * 0.45359237);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number / 0.45359237);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number / 453.6);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number * 453.6);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });


    }
}