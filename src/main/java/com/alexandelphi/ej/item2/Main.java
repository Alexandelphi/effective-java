package com.alexandelphi.ej.item2;


/**
 * Item 2: Consider a builder when faced with many constructor parameters
 */

public class Main {

  public static void main(String[] args) {
    TelescopingNutritionFacts cocaCola = new TelescopingNutritionFacts(240, 8,
        100, 0, 35, 27);

    JavaBeanNutritionFacts superCocaCola = new JavaBeanNutritionFacts();
    superCocaCola.setServingSize(240);
    superCocaCola.setServings(8);
    superCocaCola.setCalories(100);
    superCocaCola.setSodium(35);
    superCocaCola.setCarbohydrate(27);

    BuilderNutritionFacts builderCocaCola = new BuilderNutritionFacts.Builder(240, 8)
        .calories(100).sodium(25).carbohydrate(27).build();
  }
}
