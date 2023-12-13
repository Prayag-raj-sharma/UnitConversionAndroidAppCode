package com.example.unitsconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lengthunit extends AppCompatActivity {

    Button sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lengthunit);

        ed1 = findViewById(R.id.value);
        sp1 = findViewById(R.id.MToF);
        sp2 = findViewById(R.id.FToM);
        sp3 = findViewById(R.id.CmToFt);
        sp4 = findViewById(R.id.FtToCm);
        sp5 = findViewById(R.id.IncToM);
        sp6 = findViewById(R.id.IncToCm);
        sp7 = findViewById(R.id.MToInc);
        sp8 = findViewById(R.id.CmToInc);


        sp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number * 3.28084);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number / 3.28084);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number / 30.48);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number * 30.48);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number / 39.37);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number * 2.54);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number * 39.37);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
        sp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number / 2.54);
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}