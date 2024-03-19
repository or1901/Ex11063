package com.example.ex11063;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner statesSpinner;
    private String[] names, capitals, populations;
    private int[] flags;
    private ArrayList<State> states;
    private StateAdapter statesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAll();
    }

    private void initAll() {
        statesSpinner = findViewById(R.id.statesSpinner);

        names = new String[]
                {"Israel", "United States", "France", "Germany", "Spain", "Italy", "Greece"};

        flags = new int[]
                { R.drawable.israel, R.drawable.us, R.drawable.france, R.drawable.germany,
                        R.drawable.spain, R.drawable.italy, R.drawable.greece};

        capitals = new String[]
                {"Jerusalem", "Washington", "Paris", "Berlin", "Madrid", "Rome", "Athens"};

        populations = new String[]
                {"9,855,000", "335,893,238", "68,381,000", "84,607,016", "48,592,909", "58,909,449",
                "10,413,982"};

        states = new ArrayList<State>();
        for (int i = 0; i < names.length; i++) {
            states.add(new State(names[i], capitals[i], flags[i], populations[i]));
        }

        statesAdapter = new StateAdapter(this, states);
        statesSpinner.setAdapter(statesAdapter);
    }
}