package com;

import com.arena.Arena;
import com.player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input from the user
        System.out.println("Enter First Player Name: ");
        String p1_name = scanner.next();
        System.out.println("Enter First Player Health: ");
        int p1_health = scanner.nextInt();
        System.out.println("Enter First Player Strength: ");
        int p1_strength = scanner.nextInt();
        System.out.println("Enter First Player Attack: ");
        int p1_attack = scanner.nextInt();
        System.out.println("Enter Second Player Name: ");
        String p2_name = scanner.next();
        System.out.println("Enter Second Player Health: ");
        int p2_health = scanner.nextInt();
        System.out.println("Enter Second Player Strength: ");
        int p2_strength = scanner.nextInt();
        System.out.println("Enter Second Player Attack: ");
        int p2_attack = scanner.nextInt();
        //Player Declaration
        Player player1 = new Player(p1_name,p1_health,p1_strength,p1_attack);
        Player player2 = new Player(p2_name,p2_health,p2_strength,p2_attack);
        //Initialise the Arena
        Arena arena = new Arena(player1,player2);
        //Start the fight
        arena.startFight();

    }
}