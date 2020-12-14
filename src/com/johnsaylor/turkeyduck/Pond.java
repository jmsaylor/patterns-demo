package com.johnsaylor.turkeyduck;

import java.util.ArrayList;
import java.util.List;

public class Pond {
    List<Duck> pond = new ArrayList<>();

    public void flyIntoPond(Duck duck) {
        pond.add(duck);
    }

    public void everybodyQuacks() {
        pond.forEach(Duck::quack);
    }
}
