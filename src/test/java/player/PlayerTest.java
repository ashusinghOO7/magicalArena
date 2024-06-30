package player;

import org.example.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    // Test to verify player attributes
    @Test
    public void testPlayerAttributes() {
        Player player = new Player("TestPlayer", 50, 5, 10);
        assertEquals("TestPlayer", player.getName());
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }
    //Test to verify health reduction
    @Test
    public void testHealthReduction() {
        Player player = new Player("Test Player", 50, 5, 10);
        player.reduceHealth(20);
        assertEquals(30, player.getHealth());
        player.reduceHealth(40);
        assertEquals(0, player.getHealth());
        assertFalse(player.isAlive());
    }

    // Test to check if player is alive
    @Test
    public void testIsAlive() {
        Player player = new Player("TestPlayer", 50, 5, 10);
        assertTrue(player.isAlive());
        player.reduceHealth(50);
        assertFalse(player.isAlive());
    }
}
