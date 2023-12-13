package com.example.unitsconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //temp.onClick

        b1 = (Button) findViewById(R.id.temp);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentemperatureunits();
            }
        });
        b2 = (Button) findViewById(R.id.len);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLengthunit();
            }
        });
        b3 = (Button) findViewById(R.id.wid);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWidthunit();
            }
        });

    }
        public void opentemperatureunits() {
             Intent intent = new Intent(this,temperatureunits.class);
             startActivity(intent);
        }
        public void openLengthunit() {
            Intent intent = new Intent(this,Lengthunit.class);
            startActivity(intent);
        }
        public void openWidthunit() {
            Intent intent = new Intent(this, Weightunit.class);
            startActivity(intent);
        }

}