package cc.locati.cards.libs;

import org.junit.*;

import cc.locati.cards.libs.rummy.*;

import static org.junit.Assert.*;

/**
 * Test for Player class
 */
public class PlayerTest {

    @Test
    public void toStringTest() {
        Player player = new Player(0);
        player.drawCard(new Card(5, 0, 0));
        System.out.println(player.toString());
    }
}
