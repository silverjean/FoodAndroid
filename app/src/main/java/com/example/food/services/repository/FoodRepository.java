package com.example.food.repository;

import com.example.food.entities.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

    private List<FoodEntity> mListFood;

    public FoodRepository() {
        this.mListFood = new ArrayList<>();

        this.mListFood.add(new FoodEntity(0, "Alface crespa", 8, 60, "g", "Este alimento contém vitamina A, C, e K."));
        this.mListFood.add(new FoodEntity(1, "Azeite", 90, 10, "g", ""));
        this.mListFood.add(new FoodEntity(2, "Batata doce", 115, 100, "g", "Este alimento é rico em vitamina A."));
        this.mListFood.add(new FoodEntity(3, "Ervilha crua", 81, 70, "g", ""));
        this.mListFood.add(new FoodEntity(4, "Feijão carioca", 71, 75, "g", "Este alimento é rico em feroo."));
        this.mListFood.add(new FoodEntity(5, "File de frango frito", 240, 100, "g", "Alimento rico em proteínas."));
        this.mListFood.add(new FoodEntity(6, "Grão de bico", 720, 200, "g", ""));
        this.mListFood.add(new FoodEntity(7, "Macarrão cozido", 221, 140, "g", ""));
        this.mListFood.add(new FoodEntity(8, "Pão de forma 12 grãos", 110, 50, "g", "Este alimento contém baixo toer de gordura."));
        this.mListFood.add(new FoodEntity(9, "Queijo parmezão", 18, 71, "g", ""));
        this.mListFood.add(new FoodEntity(10, "Rúcula", 5, 20, "g", "Este alimento contém cálcio e ferro"));
        this.mListFood.add(new FoodEntity(11, "Vagem cozida", 44, 125, "g", ""));
        this.mListFood.add(new FoodEntity(12, "Vodka", 231, 100, "ml", "0g de gordura, 0g de proteína. Somente carboidratos."));
        this.mListFood.add(new FoodEntity(13, "Whisky", 58, 23, "ml", ""));


    }

    public List<FoodEntity> getList() {
        return this.mListFood;
    }

    public FoodEntity get(int id) {
        return this.mListFood.get(id);
    }
}
