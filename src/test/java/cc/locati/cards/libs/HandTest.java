package cc.locati.cards.libs;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Tests are available for the functions:
 */

public class HandTest {

    Hand bigHand;

    @Before
    public void init() throws Exception {
        bigHand = new Hand();
        bigHand.addCard(new Card(10, 2, 0));
        bigHand.addCard(new Card(9, 3, 0));
        bigHand.addCard(new Card(10, 1, 0));
        bigHand.addCard(new Card(9, 0, 0));
        bigHand.addCard(new Card(3, 3, 0));
        bigHand.addCard(new Card(3, 2, 0));
        bigHand.addCard(new Card(10, 1, 0));
        bigHand.addCard(new Card(10, 0, 0));
        bigHand.addCard(new Card(8, 3, 0));
        bigHand.addCard(new Card(8, 1, 0));
        bigHand.addCard(new Card(8, 2, 0));
    }

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
        assertEquals(hand.getCard(0).toString(), "Ace of Hearts deck 0");
    }

    @Test
    public void sortByValue1() throws Exception {
        Hand bigHandHearts = new Hand();
        bigHandHearts.addCard(new Card(10, 0, 0));
        bigHandHearts.addCard(new Card(9, 0, 0));
        bigHandHearts.addCard(new Card(3, 0, 0));
        bigHandHearts.addCard(new Card(5, 0, 0));
        bigHandHearts.addCard(new Card(2, 0, 0));
        bigHandHearts.addCard(new Card(4, 0, 0));
        bigHandHearts.addCard(new Card(7, 0, 0));
        bigHandHearts.addCard(new Card(6, 0, 0));
        bigHandHearts.addCard(new Card(1, 0, 0));
        bigHandHearts.addCard(new Card(8, 0, 0));
        bigHandHearts.sortByValue();
        assertEquals(bigHandHearts.getCard(0).getValue(), 1);
        assertEquals(bigHandHearts.getCard(1).getValue(), 2);
        assertEquals(bigHandHearts.getCard(2).getValue(), 3);
        assertEquals(bigHandHearts.getCard(3).getValue(), 4);
        assertEquals(bigHandHearts.getCard(4).getValue(), 5);
        assertEquals(bigHandHearts.getCard(5).getValue(), 6);
        assertEquals(bigHandHearts.getCard(6).getValue(), 7);
        assertEquals(bigHandHearts.getCard(7).getValue(), 8);
        assertEquals(bigHandHearts.getCard(8).getValue(), 9);
        assertEquals(bigHandHearts.getCard(9).getValue(), 10);
    }

    @Test
    public void sortByValue2() throws Exception {
        Hand bigHand = new Hand();
        bigHand.addCard(new Card(10, 2, 0));
        bigHand.addCard(new Card(9, 3, 0));
        bigHand.addCard(new Card(3, 1, 0));
        bigHand.addCard(new Card(5, 0, 0));
        bigHand.addCard(new Card(2, 3, 0));
        bigHand.addCard(new Card(4, 2, 0));
        bigHand.addCard(new Card(7, 1, 0));
        bigHand.addCard(new Card(6, 3, 0));
        bigHand.addCard(new Card(1, 1, 0));
        bigHand.addCard(new Card(8, 2, 0));
        bigHand.sortByValue();
        assertEquals(bigHand.getCard(0).getValue(), 1);
        assertEquals(bigHand.getCard(1).getValue(), 2);
        assertEquals(bigHand.getCard(2).getValue(), 3);
        assertEquals(bigHand.getCard(3).getValue(), 4);
        assertEquals(bigHand.getCard(4).getValue(), 5);
        assertEquals(bigHand.getCard(5).getValue(), 6);
        assertEquals(bigHand.getCard(6).getValue(), 7);
        assertEquals(bigHand.getCard(7).getValue(), 8);
        assertEquals(bigHand.getCard(8).getValue(), 9);
        assertEquals(bigHand.getCard(9).getValue(), 10);
    }

    @Test
    public void countByNumber() throws Exception {
        int[] count = bigHand.countByNumber();
        assertEquals(count[1], 0);
        assertEquals(count[2], 0);
        assertEquals(count[3], 2);
        assertEquals(count[4], 0);
        assertEquals(count[5], 0);
        assertEquals(count[6], 0);
        assertEquals(count[7], 0);
        assertEquals(count[8], 3);
        assertEquals(count[9], 2);
        assertEquals(count[10], 4);
        assertEquals(count[11], 0);
        assertEquals(count[12], 0);
        assertEquals(count[13], 0);
    }

    @Test
    public void getCountByNumber() throws Exception {
        assertEquals(bigHand.getCountByNumber(1), 0);
        assertEquals(bigHand.getCountByNumber(2), 0);
        assertEquals(bigHand.getCountByNumber(3), 2);
        assertEquals(bigHand.getCountByNumber(4), 0);
        assertEquals(bigHand.getCountByNumber(5), 0);
        assertEquals(bigHand.getCountByNumber(6), 0);
        assertEquals(bigHand.getCountByNumber(7), 0);
        assertEquals(bigHand.getCountByNumber(8), 3);
        assertEquals(bigHand.getCountByNumber(9), 2);
        assertEquals(bigHand.getCountByNumber(10), 4);
    }

    @Test
    public void getCountBySuit() throws Exception {
        assertEquals(bigHand.getCountBySuit(0), 2);
        assertEquals(bigHand.getCountBySuit(1), 3);
        assertEquals(bigHand.getCountBySuit(2), 3);
        assertEquals(bigHand.getCountBySuit(3), 3);
    }

    @Test
    public void getCountPairs() throws Exception {
        assertEquals(bigHand.getCountPairs(), 2);
    }

    @Test
    public void getCountTriples() throws Exception {
        assertEquals(bigHand.getCountTriples(), 1);
    }

    @Test
    public void getCountPokers() throws Exception {
        assertEquals(bigHand.getCountPokers(), 1);
    }

}
