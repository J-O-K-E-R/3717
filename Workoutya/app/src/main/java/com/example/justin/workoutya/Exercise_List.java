package com.example.justin.workoutya;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class Exercise_List extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise__list);

        String[] values = new String[] { "Push up", "Sit Up", "Pull Up",
                "Squat", "Barbell", "Dead Lift", "Bench Press"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);

        Button Execise_Btn = (Button)findViewById(R.id.ExeciseBtn);

        Execise_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercise_List.this, Exercise.class));
            }
        });
    }
}