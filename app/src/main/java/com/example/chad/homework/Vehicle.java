package com.example.chad.homework;

import java.util.HashMap;

/**
 * Created by chad on 25/10/2017.
 */

public abstract class Vehicle {
    private String name;
    private double healthValue;
    private HashMap<String, Double> attack;

    public Vehicle(String name, double healthValue, HashMap<String, Double> attack) {
        this.name = name;
        this.healthValue = healthValue;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public double getHealthValue() {
        return healthValue;
    }

    public double getAttack(String attack) {
        return this.attack.get(attack);
    }

    public void decreaseHealth(double hit) {
        this.healthValue -= hit;
    }

    public String attack(Kaiju monster, String attackType) {
        monster.decreaseHealth(getAttack(attackType));
        return name + " attacks " + monster.getName() + " with its " + attackType + " weapon!";
    }
}
