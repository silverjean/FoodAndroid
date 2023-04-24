package com.example.food.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.services.listener.OnListClick;
import com.example.food.R;
import com.example.food.entities.FoodEntity;
import com.example.food.viewholder.FoodViewHolder;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private List<FoodEntity> foodList;
    private OnListClick listener;

    public FoodAdapter(List<FoodEntity> list, OnListClick foodListener) {
        this.foodList = list;
        this.listener = foodListener;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.item_food, parent, false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodEntity foodEntity = this.foodList.get(position);
        holder.bind(foodEntity, listener);
    }

    @Override
    public int getItemCount() {
        return this.foodList.size();
    }
}
