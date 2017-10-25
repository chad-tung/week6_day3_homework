package com.example.chad.homework;

/**
 * Created by chad on 25/10/2017.
 */

public class LandMonster extends Kaiju {
    public LandMonster(String name, double healthValue, double attackValue) {
        super(name, healthValue, attackValue);
    }

    public String travel() {
        return super.getName() + " stomps into Tokyo.";
    }

    public String roar() {
        return super.getName() + " lets out a bellowing roar!";
    }

    public String attack(Vehicle vehicle){
        vehicle.decreaseHealth(getAttackValue());
        return super.getName() + " swipes at the " + vehicle.getName();
    }

}
