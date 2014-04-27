package cc.locati.cards.libs;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Tests are available for the functions:
 * Card()
 * Card(int, int, int)
 * toString()
 * getValue()
 * getValueAsString()
 * getValueAsShortString()
 * getSuit()
 * getSuitAsString()
 * getDeck()
 */
public class CardTest {

    Card card1;
    Card card2;
    Card card3;

    @Before
    public void setUpBeforeClass() throws Exception {
        card1 = new Card(); // 1 = Jocker
        card2 = new Card(5, 0, 1); // 2 = 5 of Hearts
        card3 = new Card(1, 1, 2); // 3 = Ace of Diamonds
    }

    // Joker
    @Test
    public void testToString1() throws Exception {
        assertEquals("Joker deck 0", card1.toString());
    }

    @Test
    public void testGetValue1() throws Exception {
        assertEquals(1, card1.getValue());
    }

    @Test
    public void testGetValueAsString1() throws Exception {
        assertEquals("1", card1.getValueAsString());
    }

    @Test
    public void testGetValueAsShortString1() throws Exception {
        assertEquals("1", card1.getValueAsShortString());
    }

    @Test
    public void testGetSuit1() throws Exception {
        assertEquals(4, card1.getSuit());
    }

    @Test
    public void testGetSuitAsString1() throws Exception {
        assertEquals("Joker", card1.getSuitAsString());
    }

    @Test
    public void testGetDeck1() throws Exception {
        assertEquals(0, card1.getDeck());
    }

    @Test
    public void testGetAsset1() throws Exception {
        assertEquals("decks/default/joker.svg", card1.getAsset());
    }

    // 5 of Hearts
    @Test
    public void testToString2() throws Exception {
        assertEquals("5 of Hearts deck 1", card2.toString());
    }

    @Test
    public void testGetValue2() throws Exception {
        assertEquals(5, card2.getValue());
    }

    @Test
    public void testGetValueAsString2() throws Exception {
        assertEquals("5", card2.getValueAsString());
    }

    @Test
    public void testGetValueAsShortString2() throws Exception {
        assertEquals("5", card2.getValueAsShortString());
    }

    @Test
    public void testGetSuit2() throws Exception {
        assertEquals(0, card2.getSuit());
    }

    @Test
    public void testGetSuitAsString2() throws Exception {
        assertEquals("Hearts", card2.getSuitAsString());
    }

    @Test
    public void testGetDeck2() throws Exception {
        assertEquals(1, card2.getDeck());
    }

    @Test
    public void testGetAsset2() throws Exception {
        assertEquals("decks/default/0/5.svg", card2.getAsset());
    }

    // Ace of Diamonds (still to be changed)
    @Test
    public void testToString3() throws Exception {
        assertEquals("Ace of Diamonds deck 2", card3.toString());
    }

    @Test
    public void testGetValue3() throws Exception {
        assertEquals(1, card3.getValue());
    }

    @Test
    public void testGetValueAsString3() throws Exception {
        assertEquals("Ace", card3.getValueAsString());
    }

    @Test
    public void testGetValueAsShortString3() throws Exception {
        assertEquals("A", card3.getValueAsShortString());
    }

    @Test
    public void testGetSuit3() throws Exception {
        assertEquals(1, card3.getSuit());
    }

    @Test
    public void testGetSuitAsString3() throws Exception {
        assertEquals("Diamonds", card3.getSuitAsString());
    }

    @Test
    public void testGetDeck3() throws Exception {
        assertEquals(2, card3.getDeck());
    }

    @Test
    public void testGetAsset3() throws Exception {
        assertEquals("decks/default/1/A.svg", card3.getAsset());
    }

}
