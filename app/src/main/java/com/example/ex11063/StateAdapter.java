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

/**
 * StateAdapter class:
 * a custom adapter between a list of State objects, and a given spinner/list view.
 * @author Ori Roitzaid <or1901 @ bs.amalnet.k12.il>
 * @version	1
 * @since 19/3/2024
 */
public class StateAdapter extends BaseAdapter {
    private ArrayList<State> statesList;
    LayoutInflater inflater;

    /**
     * A constructor which initializes the adapter with a given context, and states list.
     * @param context The context to use the adapter in.
     * @param statesList The list of states to use in the adapter.
     */
    public StateAdapter(@NonNull Context context, ArrayList<State> statesList) {
        this.statesList = statesList;
        inflater = (LayoutInflater.from(context));
    }

    /**
     * This function gets the number of states in the adapter.
     * @return The number of states in the adapter
     */
    @Override
    public int getCount() {
        return statesList.size();
    }

    /**
     * This function gets the item in a given position in the States list.
     * @param i The given position.
     * @return The item in the given position in the States list.
     */
    @Override
    public Object getItem(int i) {
        return statesList.get(i);
    }

    /**
     * This function gets the id of a state from the list(basically its position).
     * @param i The state position in the list.
     * @return The id of the given State's position.
     */
    @Override
    public long getItemId(int i) {
        return i;
    }

    /**
     * This function makes a view object for a given State in the list(it makes each row in the
     * spinner).
     * @param position The position of the State in the list.
     * @param view The view object to use.
     * @param parent The ViewGroup - probably the spinner view.
     * @return A view object for the given State in the list.
     */
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
