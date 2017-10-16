package com.hfad.Project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FoodDetailActivity extends AppCompatActivity {
    public static final String EXTRA_FOOD_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        FoodDetailFragment frag = (FoodDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int foodId = (int) getIntent().getExtras().get(EXTRA_FOOD_ID);
        frag.setFood(foodId);
    }
}
