package com.example.ex11063;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StateAdapter extends ArrayAdapter<State> {
    private ArrayList<State> stateList;
    LayoutInflater inflater;

    public StateAdapter(@NonNull Context context, ArrayList<State> stateList) {
        super(context, R.layout.state_layout, stateList);
        this.stateList = stateList;
        inflater = (LayoutInflater.from(context));
    }

    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        view = inflater.inflate(R.layout.state_layout, parent, false);

        ImageView stateIv = view.findViewById(R.id.stateIv);
        TextView stateNameTv = view.findViewById(R.id.stateNameTv);
        TextView stateCapitalTv = view.findViewById(R.id.stateCapitalTv);

        State state = this.stateList.get(position);

        stateIv.setImageResource(state.getImageId());
        stateNameTv.setText(state.getName());
        stateCapitalTv.setText(state.getCapital());

        return view;
    }
}
