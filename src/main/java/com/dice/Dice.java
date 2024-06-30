package com.dice;
import java.util.*;
public class Dice {
    private static final int SIDES = 6;
    private Random random;

    public Dice(){
        this.random = new Random();
    }

    // Method to get value after rolling the dice
    public int roll() {
        return random.nextInt(SIDES) + 1;
    }

}
