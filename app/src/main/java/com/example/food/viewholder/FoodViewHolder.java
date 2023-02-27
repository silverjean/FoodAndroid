package com.example.food.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.OnListClick;
import com.example.food.R;
import com.example.food.entity.FoodEntity;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    private TextView tViewName;
    private TextView tViewCalories;
    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);

        this.tViewName = itemView.findViewById(R.id.text_name);
        this.tViewCalories = itemView.findViewById(R.id.text_calories);

    }

    public void bind(FoodEntity food, OnListClick listener) {

        this.tViewName.setText(food.getName());
        this.tViewCalories.setText(String.valueOf(food.getCalories()));

        this.tViewName.setOnClickListener(view -> listener.onClick(food.getId()));
    }
}
