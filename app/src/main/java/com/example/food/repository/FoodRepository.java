package com.example.food.repository;

import com.example.food.entity.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

    private List<FoodEntity> mListFood;

    public FoodRepository() {
        this.mListFood = new ArrayList<>();

        this.mListFood.add(new FoodEntity(0, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(1, "Azeite", 90));
        this.mListFood.add(new FoodEntity(2, "Batata doce", 115));
        this.mListFood.add(new FoodEntity(3, "Ervilha crua", 81));
        this.mListFood.add(new FoodEntity(4, "Feijão carioca", 71));
        this.mListFood.add(new FoodEntity(5, "File de frango frito", 240));
        this.mListFood.add(new FoodEntity(6, "Grão de bico", 720));
        this.mListFood.add(new FoodEntity(7, "Macarrão cozido", 221));
        this.mListFood.add(new FoodEntity(8, "Pão de forma 12 grãos", 110));
        this.mListFood.add(new FoodEntity(9, "Queijo parmezão", 18));
        this.mListFood.add(new FoodEntity(10, "Rúcula", 5));
        this.mListFood.add(new FoodEntity(11, "Vagem cozida", 44));
        this.mListFood.add(new FoodEntity(12, "Vodka", 231));
        this.mListFood.add(new FoodEntity(13, "Whisky", 58));


    }

    public List<FoodEntity> getList() {
        return this.mListFood;
    }

    public FoodEntity get(int id) {
        return this.mListFood.get(id);
    }
}
