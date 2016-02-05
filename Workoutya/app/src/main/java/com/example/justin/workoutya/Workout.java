
package com.example.justin.workoutya;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Workout extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        String[] values = new String[] { "exereise 1", "exereise 2", "exereise 3", "exereise 4", "exereise 5" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }
}