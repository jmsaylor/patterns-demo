package com.johnsaylor.starbuzz;

public class WhippedCream extends Condiment{
    Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.77;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }
}
