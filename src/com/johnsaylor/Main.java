package com.johnsaylor;

import com.johnsaylor.starbuzz.*;

public class Main {

    public static void main(String[] args) {
        Beverage coffee = new Americano();
        coffee = new Mocha(coffee);
        coffee = new Espresso(coffee);
        coffee = new WhippedCream(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());
    }
}
