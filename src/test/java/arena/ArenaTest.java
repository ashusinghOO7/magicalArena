package arena;

import com.arena.Arena;
import com.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {
    //Test to stimulate a complete fight and check for the winner
    @Test
    public void testFight(){
        Player playerA = new Player("Player A",50,5,10);
        Player playerB = new Player("Player B",100,10,5);

        //Stimulate a fight and check for the winner
        Arena arena = new Arena(playerA,playerB);
        assertTrue(playerA.isAlive() || playerB.isAlive());
    }
    // Test to simulate a fight where Player A has higher initial health
    @Test
    public void testFightWithPlayerAAdvantage() {
        Player playerA = new Player("Player A", 150, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        Arena arena = new Arena(playerA, playerB);

        arena.startFight();
        assertTrue(playerA.isAlive() || playerB.isAlive());
    }

    // Test to simulate a fight where Player B has higher initial health
    @Test
    public void testFightWithPlayerBAdvantage() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 200, 10, 5);
        Arena arena = new Arena(playerA, playerB);

        arena.startFight();
        assertTrue(playerA.isAlive() || playerB.isAlive());
    }

    // Test to simulate a fight where both players have equal attributes
    @Test
    public void testFightWithEqualPlayers() {
        Player playerA = new Player("Player A", 100, 10, 10);
        Player playerB = new Player("Player B", 100, 10, 10);
        Arena arena = new Arena(playerA, playerB);

        arena.startFight();
        assertTrue(playerA.isAlive() || playerB.isAlive());
    }

    // Test to ensure that attack and defense mechanics work as expected
    @Test
    public void testAttackAndDefense() {
        Player attacker = new Player("Attacker", 100, 5, 10);
        Player defender = new Player("Defender", 100, 10, 5);
        Arena arena = new Arena(attacker, defender);

        // Simulate an attack
        int initialHealth = defender.getHealth();
        arena.startFight();

        // Verify that defender's health has decreased
        assertTrue(defender.getHealth() < initialHealth);
    }

}
