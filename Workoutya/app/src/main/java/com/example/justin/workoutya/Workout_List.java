package com.example.justin.workoutya;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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


    }
    @Override
    public void onListItemClick(final ListView list,
                                final View     view,
                                final int      position,
                                final long     id)
    {
        final String title;

        Intent intent = new Intent(this, Workout.class);
        startActivity(intent);
    }

}