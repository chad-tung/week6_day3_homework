package com.example.chad.homework;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static android.R.id.primary;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static org.junit.Assert.assertEquals;

/**
 * Created by chad on 25/10/2017.
 */

public class BattleTest {

    AirVehicle helicopter;
    LandVehicle tank;
    SeaMonster godzilla;
    AirMonster mothra;
    LandMonster muto;

    @Before
    public void before() {
        HashMap<String, Double> helicopterMap = new HashMap<String, Double>();
        helicopterMap.put("primary", 100.0);
        helicopterMap.put("secondary", 70.0);
        HashMap<String, Double> tankMap = new HashMap<String, Double>();
        tankMap.put("primary", 120.0);
        tankMap.put("secondary", 50.0);

        helicopter = new AirVehicle("Apache", 200.0, helicopterMap);
        tank = new LandVehicle("M1 Abrams", 280.0, tankMap);

        godzilla = new SeaMonster("Godzilla", 1000.0, 100.0);
        mothra = new AirMonster("Mothra", 800.0, 135.0);
        muto = new LandMonster("MUTO", 1600.0, 65.0);
    }

    @Test
    public void canTravel() {
        assertEquals("Godzilla swims to Tokyo.", godzilla.travel());
        assertEquals("Mothra flies into Tokyo.", mothra.travel());
        assertEquals("MUTO stomps into Tokyo.", muto.travel());
    }

    @Test
    public void kaijuCanAttack() {
        assertEquals("Godzilla breathes fire on the Apache", godzilla.attack(helicopter));
        assertEquals(100.0, helicopter.getHealthValue(), 0.1);
    }

    @Test
    public void vehicleCanAttack() {
        assertEquals("M1 Abrams attacks Mothra with its primary weapon!", tank.attack(mothra, "primary"));
        assertEquals(680.0, mothra.getHealthValue(), 0.1);
    }
}
