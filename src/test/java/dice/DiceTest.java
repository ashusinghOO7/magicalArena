package dice;

import com.dice.Dice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DiceTest {
    //Test to ensure dice always outputs in a valid range
    @Test
    public void testDice(){
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}
