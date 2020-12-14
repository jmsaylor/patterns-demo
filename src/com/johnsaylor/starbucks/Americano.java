package com.johnsaylor.starbucks;

public class Americano extends Beverage{

    public Americano() {
        this.description = "Americano";
    }

    @Override
    public double cost() {
        return 3.39;
    }
}
