package com.example.ex11063;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StateAdapter extends BaseAdapter {
    private ArrayList<State> statesList;
    LayoutInflater inflater;

    public StateAdapter(@NonNull Context context, ArrayList<State> statesList) {
        this.statesList = statesList;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return statesList.size();
    }

    @Override
    public Object getItem(int i) {
        return statesList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        view = inflater.inflate(R.layout.state_layout, parent, false);

        ImageView stateIv = view.findViewById(R.id.stateIv);
        TextView stateNameTv = view.findViewById(R.id.stateNameTv);
        TextView stateCapitalTv = view.findViewById(R.id.stateCapitalTv);

        State state = statesList.get(position);

        stateIv.setImageResource(state.getImageId());
        stateNameTv.setText(state.getName());
        stateCapitalTv.setText(state.getCapital());

        return view;
    }
}
