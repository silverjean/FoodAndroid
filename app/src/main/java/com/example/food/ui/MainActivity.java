package com.example.food.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.food.OnListClick;
import com.example.food.adapter.FoodAdapter;
import com.example.food.business.FoodBusiness;
import com.example.food.contants.FoodContants;
import com.example.food.entity.FoodEntity;
import com.example.food.R;
import com.example.food.repository.FoodRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<FoodEntity> list = new FoodBusiness().getList();

        OnListClick foodListener = id -> {
            Bundle bundle = new Bundle();
            bundle.putInt(FoodContants.FOOD_ID, id);

            Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
            intent.putExtras(bundle);

            startActivity(intent);
        };

        // 1 - get the recycler view
        this.mViewHolder.mRecyclerFood = findViewById(R.id.recycler_food);

        // 2 - set an adapter
        FoodAdapter adapter = new FoodAdapter(list, foodListener);

        this.mViewHolder.mRecyclerFood.setAdapter(adapter);

        // 3 - set a layout
        this.mViewHolder.mRecyclerFood.setLayoutManager(new LinearLayoutManager(this));

    }

    private static class ViewHolder {
        RecyclerView mRecyclerFood;
    }
}