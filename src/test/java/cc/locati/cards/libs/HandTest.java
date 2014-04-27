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
        bigHand.addCard(new Card(10, 3, 0));
        bigHand.addCard(new Card(10, 1, 1));
        bigHand.addCard(new Card(10, 0, 0));
        bigHand.addCard(new Card(8, 3, 0));
        bigHand.addCard(new Card(8, 1, 0));
        bigHand.addCard(new Card(8, 2, 0));
        bigHand.addCard(new Card(1, 4, 0));
    }

    @Test
    public void getCardCount1() throws Exception {
        Hand hand = new Hand();
        hand.addCard(new Card(1, 0, 0));
        assertEquals(1, hand.getCardCount());
    }

    @Test
    public void getCardCount2() throws Exception {
        Hand hand = new Hand();
        hand.addCard(new Card(1, 0, 0));
        hand.addCard(new Card(2, 0, 0));
        hand.addCard(new Card(3, 0, 0));
        assertEquals(3, hand.getCardCount());
    }

    @Test
    public void getCard() throws Exception {
        Hand hand = new Hand();
        hand.addCard(new Card(1, 0, 0));
        assertEquals("Ace of Hearts deck 0", hand.getCard(0).toString());
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
        assertEquals(1, bigHandHearts.getCard(0).getValue());
        assertEquals(2, bigHandHearts.getCard(1).getValue());
        assertEquals(3, bigHandHearts.getCard(2).getValue());
        assertEquals(4, bigHandHearts.getCard(3).getValue());
        assertEquals(5, bigHandHearts.getCard(4).getValue());
        assertEquals(6, bigHandHearts.getCard(5).getValue());
        assertEquals(7, bigHandHearts.getCard(6).getValue());
        assertEquals(8, bigHandHearts.getCard(7).getValue());
        assertEquals(9, bigHandHearts.getCard(8).getValue());
        assertEquals(10, bigHandHearts.getCard(9).getValue());
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
        assertEquals(1, bigHand.getCard(0).getValue());
        assertEquals(2, bigHand.getCard(1).getValue());
        assertEquals(3, bigHand.getCard(2).getValue());
        assertEquals(4, bigHand.getCard(3).getValue());
        assertEquals(5, bigHand.getCard(4).getValue());
        assertEquals(6, bigHand.getCard(5).getValue());
        assertEquals(7, bigHand.getCard(6).getValue());
        assertEquals(8, bigHand.getCard(7).getValue());
        assertEquals(9, bigHand.getCard(8).getValue());
        assertEquals(10, bigHand.getCard(9).getValue());
    }

    @Test
    public void countByNumber() throws Exception {
        int[] count = bigHand.countByNumber();
        assertEquals(0, count[1]);
        assertEquals(0, count[2]);
        assertEquals(2, count[3]);
        assertEquals(0, count[4]);
        assertEquals(0, count[5]);
        assertEquals(0, count[6]);
        assertEquals(0, count[7]);
        assertEquals(3, count[8]);
        assertEquals(2, count[9]);
        assertEquals(5, count[10]);
        assertEquals(0, count[11]);
        assertEquals(0, count[12]);
        assertEquals(0, count[13]);
    }

    @Test
    public void countByNumberWithoutDoubles() throws Exception {
        int[] count = bigHand.countByNumberWithoutDoubles();
        assertEquals(0, count[1]);
        assertEquals(0, count[2]);
        assertEquals(2, count[3]);
        assertEquals(0, count[4]);
        assertEquals(0, count[5]);
        assertEquals(0, count[6]);
        assertEquals(0, count[7]);
        assertEquals(3, count[8]);
        assertEquals(2, count[9]);
        assertEquals(4, count[10]);
        assertEquals(0, count[11]);
        assertEquals(0, count[12]);
        assertEquals(0, count[13]);
    }

    @Test
    public void getCountByNumber() throws Exception {
        assertEquals(0, bigHand.getCountByNumber(1));
        assertEquals(0, bigHand.getCountByNumber(2));
        assertEquals(2, bigHand.getCountByNumber(3));
        assertEquals(0, bigHand.getCountByNumber(4));
        assertEquals(0, bigHand.getCountByNumber(5));
        assertEquals(0, bigHand.getCountByNumber(6));
        assertEquals(0, bigHand.getCountByNumber(7));
        assertEquals(3, bigHand.getCountByNumber(8));
        assertEquals(2, bigHand.getCountByNumber(9));
        assertEquals(5, bigHand.getCountByNumber(10));
        assertEquals(0, bigHand.getCountByNumber(11));
        assertEquals(0, bigHand.getCountByNumber(12));
        assertEquals(0, bigHand.getCountByNumber(13));
    }

    @Test
    public void getCountByNumberWithoutDoubles() throws Exception {
        assertEquals(0, bigHand.getCountByNumberWithoutDoubles(1));
        assertEquals(0, bigHand.getCountByNumberWithoutDoubles(2));
        assertEquals(2, bigHand.getCountByNumberWithoutDoubles(3));
        assertEquals(0, bigHand.getCountByNumberWithoutDoubles(4));
        assertEquals(0, bigHand.getCountByNumberWithoutDoubles(5));
        assertEquals(0, bigHand.getCountByNumberWithoutDoubles(6));
        assertEquals(0, bigHand.getCountByNumberWithoutDoubles(7));
        assertEquals(3, bigHand.getCountByNumberWithoutDoubles(8));
        assertEquals(2, bigHand.getCountByNumberWithoutDoubles(9));
        assertEquals(4, bigHand.getCountByNumberWithoutDoubles(10));
        assertEquals(0, bigHand.getCountByNumberWithoutDoubles(11));
        assertEquals(0, bigHand.getCountByNumberWithoutDoubles(12));
        assertEquals(0, bigHand.getCountByNumberWithoutDoubles(13));
    }

    @Test
    public void getCountBySuit() throws Exception {
        assertEquals(2, bigHand.getCountBySuit(0));
        assertEquals(3, bigHand.getCountBySuit(1));
        assertEquals(3, bigHand.getCountBySuit(2));
        assertEquals(4, bigHand.getCountBySuit(3));
        assertEquals(1, bigHand.getCountBySuit(4));
    }

    @Test
    public void getCountPairs() throws Exception {
        assertEquals(2, bigHand.getCountPairs());
    }

    @Test
    public void getCountTriples() throws Exception {
        assertEquals(1, bigHand.getCountTriples());
    }

    @Test
    public void getCountPokers() throws Exception {
        assertEquals(1, bigHand.getCountPokers());
    }

}
