package com.example.chad.homework;

/**
 * Created by chad on 25/10/2017.
 */

public abstract class Kaiju {
    private String name;
    private double healthValue;
    private double attackValue;

    public Kaiju(String name, double healthValue, double attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public double getHealthValue() {
        return this.healthValue;
    }

    public double getAttackValue() {
        return attackValue;
    }

    public void setHealthValue(double healthValue) {
        this.healthValue = healthValue;
    }

    public void decreaseHealth(double hit) {
        this.healthValue -= hit;
    }

    String roar() {
        return "RAWR!";
    }
}
