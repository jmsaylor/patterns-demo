package com.johnsaylor.starbuzz;

public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();


    public static void test() {
        Beverage coffee = new Americano();
        coffee = new Mocha(coffee);
        coffee = new Espresso(coffee);
        coffee = new WhippedCream(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());
    }
}