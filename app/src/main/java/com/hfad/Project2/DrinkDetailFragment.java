package com.hfad.Project2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DrinkDetailFragment extends Fragment {
    private long drinkId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            drinkId = savedInstanceState.getLong("drinkId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_drink_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Drink drink = Drink.drinks[(int) drinkId];
            title.setText(drink.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(drink.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("drinkId", drinkId);
    }

    public void setDrink(long id) {
        this.drinkId = id;
    }
}
