package com.johnsaylor.starbuzz;

public class Americano extends Beverage{

    public Americano() {
        this.description = "Americano";
    }

    @Override
    public double cost() {
        return 3.39;
    }
}
