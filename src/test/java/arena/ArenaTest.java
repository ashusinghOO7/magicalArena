package arena;

import com.magicalarena.player.Player;
import org.example.arena.Arena;
import org.example.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {
    @Test
    public void testFight(){
        Player playerA = new Player("Player A",50,5,10);
        Player playerB = new Player("Player B",100,10,5);

        //Stimulate a fight and check for the winner
        Arena arena = new Arena(playerA,playerB);
        assertTrue((playerA.isAlive() && !playerB.isAlive()) || (!playerA.isAlive() && playerB.isAlive()));
    }

}
