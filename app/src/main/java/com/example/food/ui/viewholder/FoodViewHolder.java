package com.example.food.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.services.listener.OnListClick;
import com.example.food.R;
import com.example.food.entities.FoodEntity;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    private TextView mViewName;
    private TextView mViewCalories;
    private TextView mTextQuantity;
    private TextView mTextUnit;

    private Context mContext;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mViewName = itemView.findViewById(R.id.text_name);
        this.mViewCalories = itemView.findViewById(R.id.text_calories);
        this.mTextQuantity = itemView.findViewById(R.id.text_quantity);
        this.mTextUnit = itemView.findViewById(R.id.text_unit);

        this.mContext = itemView.getContext();

    }

    public void bind(FoodEntity food, OnListClick listener) {

        this.mViewName.setText(food.getName());

        String strCalories = String.format("%s %s", food.getCalories(), this.mContext.getString(R.string.calories));
        this.mViewCalories.setText(strCalories);
        this.mTextQuantity.setText(String.valueOf(food.getQuantity()));
        this.mTextUnit.setText(food.getUnit());

        this.mViewName.setOnClickListener(view -> listener.onClick(food.getId()));
    }
}
