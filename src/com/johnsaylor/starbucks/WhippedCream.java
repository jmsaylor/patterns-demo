package com.johnsaylor.starbucks;

public class WhippedCream extends Condiment{
    Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

//    public WhippedCream(){ this.description = "Whipped Cream"; }
//    trying to do this raises issues w/ cost() override

    @Override
    public double cost() {
        return beverage.cost() + 0.77;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }
}
