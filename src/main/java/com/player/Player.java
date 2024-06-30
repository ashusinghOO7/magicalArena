package com.player;
import java.lang.*;
public class Player {
    private final String name;
    private int health;
    private final int strength;
    private final int attack;

    public Player(String name,int health,int strength,int attack){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getters for player attributes
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getStrength(){
        return strength;
    }
    public int getAttack(){
        return attack;
    }

    // Method to reduce player's health
    public void reduceHealth(int damage){
        this.health = Math.max(this.health-damage,0);
    }

    // Check if player is still alive
    public boolean isAlive(){
        return this.health > 0;
    }

}
