package org.example.arena;


import org.example.dice.Dice;
import org.example.player.Player;

public class Arena {
    private Player player1;
    private Player player2;
    private Dice dice;

    public Arena(Player player1,Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();
    }

    public void swapRole(Player attacker, Player defender){
        Player temp = attacker;
        attacker = defender;
        defender = temp;
    }
    private void attack(Player attacker,Player defender){
        int attackerDiceValue = dice.roll();
        int defenderDiceValue = dice.roll();

        int attackDamage = attackerDiceValue * attacker.getAttack();
        int defenseStrength = defenderDiceValue * defender.getStrength();

        int damage = Math.max(attackDamage - defenseStrength, 0);

        defender.reduceHealth(damage);

        System.out.println(attacker.getName() + " attacks with roll " + attackerDiceValue + " for damage " + attackDamage);
        System.out.println(defender.getName() + " defends with roll " + defenderDiceValue + " for strength " + defenseStrength);
        System.out.println(defender.getName() + " takes " + damage + " damage and is now at " + defender.getHealth() + " health");
    }

    public void start(){
        System.out.println("The battle begins between "+ player1.getName() + " and " + player2.getName());
        Player attacker = (player1.getHealth()>player2.getHealth()) ? player2:player1;
        Player defender = (player2.getHealth()>player1.getHealth()) ? player1:player2;
        while(player1.isAlive() && player2.isAlive()){
            attack(attacker,defender);
            if(defender.isAlive()){
                swapRole(attacker,defender);
                attack(attacker,defender);
            }
        }
        if (player1.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }

}
