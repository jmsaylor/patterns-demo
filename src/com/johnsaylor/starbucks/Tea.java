package com.johnsaylor.starbucks;

public class Tea extends Beverage{

    public Tea() {this.description = "Tea";}

    @Override
    public double cost() {
        return 2.29;
    }
}
