package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String lightColor = "Red";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.changeTrafficLightButton);
        TextView trafficLight = findViewById(R.id.trafficLight);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lightColor == "Red"){
                    trafficLight.setBackgroundResource(R.color.green);
                    lightColor = "Green";
                } else if (lightColor == "Green"){
                    trafficLight.setBackgroundResource(R.color.yellow);
                    lightColor = "Yellow";
                } else if (lightColor == "Yellow"){
                    trafficLight.setBackgroundResource(R.color.red);
                    lightColor = "Red";
                }
            }}

        );

    }





}