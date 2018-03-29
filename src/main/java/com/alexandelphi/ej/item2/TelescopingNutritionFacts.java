package com.alexandelphi.ej.item2;

// Telescoping constructor pattern - doesn't scale well!!!
public class TelescopingNutritionFacts {

  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  public TelescopingNutritionFacts(int servingSize, int servings) {
    this(servingSize, servings, 0);
  }

  public TelescopingNutritionFacts(int servingSize, int servings, int calories) {
    this(servingSize, servings, calories, 0);
  }

  public TelescopingNutritionFacts(int servingSize, int servings, int calories, int fat) {
    this(servingSize, servings, calories, fat, 0);
  }

  public TelescopingNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
    this(servingSize, servings, calories, fat, sodium, 0);
  }


  public TelescopingNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium,
      int carbohydrate) {
    this.servingSize = 0;
    this.servings = 0;
    this.calories = 0;
    this.fat = 0;
    this.sodium = 0;
    this.carbohydrate = 0;
  }
}
