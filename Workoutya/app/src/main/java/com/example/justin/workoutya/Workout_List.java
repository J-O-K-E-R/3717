package com.example.justin.workoutya;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Workout_List extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout__list);

        String[] values = new String[] { "Legs", "Arms", "Core",
                "Balance", "Overhead", "Dumbells"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);

        Button ListBtn = (Button)findViewById(R.id.ListButton);

        ListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Workout_List.this, Workout.class));
            }
        });
    }

}