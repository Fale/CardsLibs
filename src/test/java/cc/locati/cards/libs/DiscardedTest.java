package cc.locati.cards.libs;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Test for discarded pile.
 */
public class DiscardedTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void NoCards() {
        Discarded discarded = new Discarded();
        assertEquals(discarded.getCardsNumber(), 0);
    }

    @Test
    public void OneCard() {
        Discarded discarded = new Discarded();
        discarded.addCard(new Card(5, 0, 0));
        assertEquals(discarded.getCardsNumber(), 1);
    }

    @Test
    public void TwoCards() {
        Discarded discarded = new Discarded();
        discarded.addCard(new Card(5, 0, 0));
        discarded.addCard(new Card(4, 2, 0));
        assertEquals(discarded.getCardsNumber(), 2);
    }

    @Test
    public void RemoveLastFromNoCards() {
        exception.expect(IllegalStateException.class);
        exception.expectMessage("No cards are present in the discarded pile.");
        Discarded discarded = new Discarded();
        discarded.removeLastCard();
    }
}
