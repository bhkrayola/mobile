package com.hobrian.lab08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //DrawView drawView;
    GarfieldView garfieldView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        garfieldView=findViewById(R.id.garfieldView);
        //drawView=findViewById(R.id.drawView);
    }

    /*public void reverseY(View view) {
        drawView.setdY(drawView.getdY()*-1);
    }*/
}