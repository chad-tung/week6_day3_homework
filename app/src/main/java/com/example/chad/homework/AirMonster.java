package com.example.chad.homework;

/**
 * Created by chad on 25/10/2017.
 */

public class AirMonster extends Kaiju {

    public AirMonster(String name, double healthValue, double attackValue) {
        super(name, healthValue, attackValue);
    }

    public String travel() {
        return super.getName() + " flies into Tokyo.";
    }

    public String roar() {
        return super.getName() + " lets out a high pitched roar!";
    }

    public String attack(Vehicle vehicle){
        vehicle.decreaseHealth(getAttackValue());
        return super.getName() + " spits acid at the " + vehicle.getName();
    }
}

