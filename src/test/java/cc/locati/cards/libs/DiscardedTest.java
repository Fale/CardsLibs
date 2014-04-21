package cc.locati.cards.libs;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test for discarded pile.
 */
public class DiscardedTest {

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
}
