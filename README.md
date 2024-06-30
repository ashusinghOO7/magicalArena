# Magical Arena

## Overview

This project simulates a magical arena where two players fight until one of them dies. Each player has attributes like health, strength, and attack. The fight is managed by the `Arena` class, and the outcome is determined by rolling dice.

## Project Structure
Magical_Arena/</br>
├── src/</br>
│ ├── main/</br>
│ │ ├── java/</br>
│ │ │ ├── com/</br>
│ │ │ │ ├── arena/</br>
│ │ │ │ │ ├── Arena.java</br>
│ │ │ │ ├── dice/</br>
│ │ │ │ │ ├── Dice.java</br>
│ │ │ │ ├── player/</br>
│ │ │ │ │ ├── Player.java</br>
│ │ │ │ ├── Main.java</br>
│ ├── test/</br>
│ │ ├── java/</br>
│ │ │ ├── arena/</br>
│ │ │ │ ├── ArenaTest.java</br>
│ │ │ ├── dice/</br>
│ │ │ │ ├── DiceTest.java</br>
│ │ │ ├── player/</br>
│ │ │ │ ├── PlayerTest.java</br>
└── pom.xml

## Prerequisites

- Java 8 or later
- Maven (for build and dependency management)

## Getting Started

- Move to the Project Directory

```bash
cd Magical_Arena
```
- Build the Project
```bash
mvn clean install
```
- Run the Application
```bash
mvn exec:java
or 
Run the Main class directly from the IDE (such as IntelliJ IDEA or Eclipse).
```
- Running Tests
```bash
mvn test
```

## How It Works
- __Player Class__: Represents a player with attributes for health, strength, and attack.
- __Dice Class__: Simulates a six-sided die roll.
- __Arena Class__: Manages the battle between two players, alternating turns, and handles attacking and defending logic.
- __Main Class__: Initializes two players and starts the fight in the arena.

## Example output

```css
The battle begins between Player A and Player B
Player A attacks with roll 5 for damage 50
Player B defends with roll 2 for strength 20
Player B takes 30 damage and is now at 70 health
Player B attacks with roll 4 for damage 20
Player A defends with roll 3 for strength 15
Player A takes 5 damage and is now at 45 health
...
Player A wins!
```

