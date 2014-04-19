package cc.locati.cards.libs;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Tests are available for the functions:
 */

public class HandTest {

    @Test
    public void getCardCount1() throws Exception {
        Hand hand = new Hand();
        hand.addCard(new Card(1, 0, 0));
        assertEquals(hand.getCardCount(), 1);
    }

    @Test
    public void getCardCount2() throws Exception {
        Hand hand = new Hand();
        hand.addCard(new Card(1, 0, 0));
        hand.addCard(new Card(2, 0, 0));
        hand.addCard(new Card(3, 0, 0));
        assertEquals(hand.getCardCount(), 3);
    }

    @Test
    public void getCard() throws Exception {
        Hand hand = new Hand();
        hand.addCard(new Card(1, 0, 0));
        assertEquals(hand.getCard(0).toString(), "Ace of Hearts");
    }

}
