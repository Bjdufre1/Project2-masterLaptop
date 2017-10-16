package com.hfad.Project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrinkDetailActivity extends AppCompatActivity {
    public static final String EXTRA_DRINK_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_detail);
        DrinkDetailFragment frag = (DrinkDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int drinkId = (int) getIntent().getExtras().get(EXTRA_DRINK_ID);
        frag.setDrink(drinkId);
    }
}
