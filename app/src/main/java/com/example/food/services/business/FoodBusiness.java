package com.example.food.business;

import com.example.food.contants.FoodContants;
import com.example.food.entities.FoodEntity;
import com.example.food.repository.FoodRepository;

import java.util.ArrayList;
import java.util.List;

public class FoodBusiness {

    private FoodRepository mFoodRepository = new FoodRepository();

    public List<FoodEntity> getList(int filter) {

        List<FoodEntity> list = this.mFoodRepository.getList();
        List<FoodEntity> filtered = new ArrayList<>();

        for (FoodEntity f: list) {
            if (filter == FoodContants.FILTER.CAL_LOW) {
                if (f.getCalories() <= 99) {
                    filtered.add(f);
                }
            } else if (filter == FoodContants.FILTER.CAL_MEDIUM) {
                if (f.getCalories() > 99 && f.getCalories() <= 199) {
                    filtered.add(f);
                }
            } else if (filter == FoodContants.FILTER.CAL_HIGH) {
                if (f.getCalories() > 199) {
                    filtered.add(f);
                }
            } else {
                filtered = list;
            }
        }
        return filtered;
    }

    public  FoodEntity get(int id) {
        return new FoodRepository().get(id);
    }
}
