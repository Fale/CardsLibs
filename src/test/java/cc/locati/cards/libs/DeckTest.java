package cc.locati.cards.libs;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Test for Deck class.
 */
public class DeckTest {

    @Test
    public void toStringTest() {
        Deck deck = new Deck();
        System.out.println(deck.toString());
    }
}
