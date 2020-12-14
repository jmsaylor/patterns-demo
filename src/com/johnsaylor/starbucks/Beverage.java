package com.johnsaylor.starbucks;
//pg. 91, 107 - Wrapper Pattern

public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();


    public static void test() {
        Beverage order2 = new Americano();
        order2 = new Mocha(order2);
//        order2 = new Mocha(order2);

        Beverage order3 = new Tea();
        order3 = new Lemon(order3);

        order2 = new Lemon(order2);

        System.out.println(order2.getDescription());
        System.out.println(order2.cost());

        System.out.println(order3.getDescription());
        System.out.println(order3.cost());

    }
}