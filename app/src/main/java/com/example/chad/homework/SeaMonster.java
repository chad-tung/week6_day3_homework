package com.example.chad.homework;

/**
 * Created by chad on 25/10/2017.
 */

public class SeaMonster extends Kaiju {
    public SeaMonster(String name, double healthValue, double attackValue) {
        super(name, healthValue, attackValue);
    }

    public String travel() {
        return super.getName() + " swims to Tokyo.";
    }

    public String roar() {
        return super.getName() + " lets out a chilling roar!";
    }

    public String attack(Vehicle vehicle) {
        vehicle.decreaseHealth(getAttackValue());
        return super.getName() + " breathes fire on the " + vehicle.getName();
    }


}
