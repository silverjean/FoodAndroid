package com.example.food.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.food.R;
import com.example.food.business.FoodBusiness;
import com.example.food.contants.FoodContants;
import com.example.food.entity.FoodEntity;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private int foodId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // interface's elements
        this.mViewHolder.mTextName = findViewById(R.id.text_name);
        this.mViewHolder.mTextCalories = findViewById(R.id.text_calories);

        this.getData();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            this.foodId = bundle.getInt(FoodContants.FOOD_ID);
            FoodEntity foodEntity = new FoodBusiness().get(this.foodId);

            this.mViewHolder.mTextName.setText(foodEntity.getName());
            this.mViewHolder.mTextCalories.setText(String.valueOf(foodEntity.getCalories()));
        }
    }

    private static class ViewHolder {
        TextView mTextName;
        TextView mTextCalories;
    }
}