package com.example.justin.workoutya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise__menu);

        Button upperBtn = (Button)findViewById(R.id.upper_btn);
        Button lowerBtn = (Button)findViewById(R.id.lower_btn);
        Button cardioBtn = (Button)findViewById(R.id.cardio_btn);

        upperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercise_Menu.this, Exercise_List.class));
            }
        });

        lowerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercise_Menu.this, Exercise_List.class));
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercise_Menu.this, Exercise_List.class));
            }
        });
    }
}