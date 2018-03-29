package com.alexandelphi.ej.item2;

// Builder Pattern
public class BuilderNutritionFacts {

  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  public static class Builder {

    //required parameters
    private int servingSize;
    private int servings;

    //optional parameters
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int value) {
      this.calories = value;
      return this;
    }

    public Builder fat(int value) {
      this.fat = value;
      return this;
    }

    public Builder sodium(int value) {
      this.sodium = value;
      return this;
    }

    public Builder carbohydrate(int value) {
      this.carbohydrate = value;
      return this;
    }

    public BuilderNutritionFacts build() {
      return new BuilderNutritionFacts(this);
    }
  }

  public BuilderNutritionFacts(Builder builder) {
    this.servingSize = 0;
    this.servings = 0;
    this.calories = 0;
    this.fat = 0;
    this.sodium = 0;
    this.carbohydrate = 0;
  }
}
