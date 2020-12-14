package com.johnsaylor.starbucks;

public class Lemon extends Condiment{

    Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.75;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Lemon";
    }
}
