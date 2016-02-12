package com.example.justin.workoutya;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    }
    @Override
    public void onListItemClick(final ListView list,
                                final View view,
                                final int      position,
                                final long     id)
    {
        final String title;

        Intent intent = new Intent(this, Exercise.class);
        startActivity(intent);
    }
}