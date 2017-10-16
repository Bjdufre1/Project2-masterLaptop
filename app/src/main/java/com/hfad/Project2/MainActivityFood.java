package com.hfad.Project2;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityFood extends AppCompatActivity implements FoodListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_food);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            FoodDetailFragment details = new FoodDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setFood(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, FoodDetailActivity.class);
            intent.putExtra(FoodDetailActivity.EXTRA_FOOD_ID, (int)id);
            startActivity(intent);
        }
    }
}
