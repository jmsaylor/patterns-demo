package com.johnsaylor.starbucks;

public class Espresso extends Condiment{
    Beverage beverage;

    public Espresso(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.29;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Espresso Shot";
    }
}
