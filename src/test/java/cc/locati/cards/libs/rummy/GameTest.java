package cc.locati.cards.libs.rummy;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Test for Game class of Rummy
 */
public class GameTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void SinglePlayerTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Too few players");
        new Game(1);
    }

    @Test
    public void NinePlayerTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Too many players");
        new Game(9);
    }

    @Test
    public void DefaultPlayersTest() {
        Game game = new Game();
        assertEquals(game.DEFAULT_PLAYERS, game.getPlayersNumber());
    }

    @Test
    public void CreationTest() {
        Game game = new Game();
        System.out.println(game.toString());
    }
}
