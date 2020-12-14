package com.johnsaylor.starbucks;
//pg. 91, 107 - Wrapper Pattern

import java.util.ArrayDeque;
import java.util.Deque;

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
        typeTest(order2);

        System.out.println(order3.getDescription());
        System.out.println(order3.cost());
        typeTest(order3);


        //          issues when trying to make Condiment a Beverage
//        Beverage justWhipped = new WhippedCream();
//        System.out.println(justWhipped.getDescription());
//        System.out.println(justWhipped.cost());
//        typeTest(justWhipped);
    }

    public static void typeTest(Beverage beverage){
        System.out.println("Is Whipped Cream? " + (beverage instanceof WhippedCream));
        System.out.println("Is a Condiment? " + (beverage instanceof Condiment));
        System.out.println("Is a Beverage? " + (beverage instanceof Beverage));
    }
}