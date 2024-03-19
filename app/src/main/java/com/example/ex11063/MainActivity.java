package com.example.ex11063;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner statesSpinner;
    private String[] names, capitals, populations;
    private int[] flags;
    private ArrayList<State> states;
    private StateAdapter statesAdapter;
    private TextView stateTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAll();
    }

    private void initAll() {
        statesSpinner = findViewById(R.id.statesSpinner);
        stateTv = findViewById(R.id.stateTv);

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
        statesSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        State state = states.get(i);
        String text = "";

        text += "Country: " + state.getName() + "\n";
        text += "Capital: " + state.getCapital() + "\n";
        text += "Population: " + state.getPopulation();

        stateTv.setText(text);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}