package com.example.food.business;

import com.example.food.entity.FoodEntity;
import com.example.food.repository.FoodRepository;

import java.util.List;

public class FoodBusiness {

    public List<FoodEntity> getList() {
        return new FoodRepository().getList();
    }

    public  FoodEntity get(int id) {
        return new FoodRepository().get(id);
    }
}
