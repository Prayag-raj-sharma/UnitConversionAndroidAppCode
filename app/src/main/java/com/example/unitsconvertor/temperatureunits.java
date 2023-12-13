package com.example.unitsconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class temperatureunits extends AppCompatActivity {

   /* Spinner sp1 = findViewById(R.id.spf),sp2 = findViewById(R.id.spt);
    EditText ed1;
    Button convert; */
    Button sp1,sp2;
    EditText ed1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatureunits);

        ed1 = findViewById(R.id.value);
        sp1 = findViewById(R.id.FToC);
        sp2 = findViewById(R.id.CToF);

       /* String[] from = {"Celsius","Fahrenheit"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"Celsius","Fahrenheit"};
        ArrayAdapter adt = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(adt);*/

        sp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number * 1.80) + 32;
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();

                /*else if(sp1.getSelectedItem().toString() == "Fahrenheit" && sp2.getSelectedItem().toString() == "Celsius")
                {
                    res = ((number-32)*5)/9;
                    Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
                }*/
            }
        });
        sp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double res;
                String num = ed1.getText().toString();
                Double number = Double.parseDouble(num);
                res = (number -32) / 1.80;
                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}