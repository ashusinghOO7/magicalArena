package com.arena;


import com.dice.Dice;
import com.player.Player;

public class Arena {
    private Player player1;
    private Player player2;
    private Dice dice;

    public Arena(Player player1,Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();
    }

    // Method to handle an attack between two players
    private void attack(Player attacker,Player defender){
        int attackerDiceValue = dice.roll();
        int defenderDiceValue = dice.roll();

        int attackDamage = attackerDiceValue * attacker.getAttack();
        int defenseStrength = defenderDiceValue * defender.getStrength();

        int damage = Math.max(attackDamage - defenseStrength, 0);

        // Reduce defender's health based on damage taken
        defender.reduceHealth(damage);

        // Print attack and defense details
        System.out.println(attacker.getName() + " attacks with roll " + attackerDiceValue + " for damage " + attackDamage);
        System.out.println(defender.getName() + " defends with roll " + defenderDiceValue + " for strength " + defenseStrength);
        System.out.println(defender.getName() + " takes " + damage + " damage and is now at " + defender.getHealth() + " health");
    }

    // Method to start the fight between two players
    public void startFight(){
        System.out.println("The battle begins between "+ player1.getName() + " and " + player2.getName());
        // Decide initial attacker based on health
        Player initialAttacker = (player1.getHealth()>player2.getHealth()) ? player2:player1;
        Player initialDefender = (player1.getHealth()>player2.getHealth()) ? player1:player2;
        // Continue fighting until one player is dead
        while(player1.isAlive() && player2.isAlive()){
            attack(initialAttacker,initialDefender);
            if(initialDefender.isAlive()){
                attack(initialDefender,initialAttacker);
            }
        }

        // Print the winner after the fight ends
        if (player1.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }

}
