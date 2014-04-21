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
        assertEquals(card1.toString(), "Joker deck 0");
    }

    @Test
    public void testGetValue1() throws Exception {
        assertEquals(card1.getValue(), 1);
    }

    @Test
    public void testGetValueAsString1() throws Exception {
        assertEquals(card1.getValueAsString(), "1");
    }

    @Test
    public void testGetValueAsShortString1() throws Exception {
        assertEquals(card1.getValueAsShortString(), "1");
    }

    @Test
    public void testGetSuit1() throws Exception {
        assertEquals(card1.getSuit(), 4);
    }

    @Test
    public void testGetSuitAsString1() throws Exception {
        assertEquals(card1.getSuitAsString(), "Joker");
    }

    @Test
    public void testGetDeck1() throws Exception {
        assertEquals(card1.getDeck(), 0);
    }

    @Test
    @Ignore
    public void testGetAsset1() throws Exception {
        assertEquals(card1.getAsset(), "decks/default/5/1.svg");
    }

    // 5 of Hearts
    @Test
    public void testToString2() throws Exception {
        assertEquals(card2.toString(), "5 of Hearts deck 1");
    }

    @Test
    public void testGetValue2() throws Exception {
        assertEquals(card2.getValue(), 5);
    }

    @Test
    public void testGetValueAsString2() throws Exception {
        assertEquals(card2.getValueAsString(), "5");
    }

    @Test
    public void testGetValueAsShortString2() throws Exception {
        assertEquals(card2.getValueAsShortString(), "5");
    }

    @Test
    public void testGetSuit2() throws Exception {
        assertEquals(card2.getSuit(), 0);
    }

    @Test
    public void testGetSuitAsString2() throws Exception {
        assertEquals(card2.getSuitAsString(), "Hearts");
    }

    @Test
    public void testGetDeck2() throws Exception {
        assertEquals(card2.getDeck(), 1);
    }

    @Test
    public void testGetAsset2() throws Exception {
        assertEquals(card2.getAsset(), "decks/default/0/5.svg");
    }

    // Ace of Diamonds (still to be changed)
    @Test
    public void testToString3() throws Exception {
        assertEquals(card3.toString(), "Ace of Diamonds deck 2");
    }

    @Test
    public void testGetValue3() throws Exception {
        assertEquals(card3.getValue(), 1);
    }

    @Test
    public void testGetValueAsString3() throws Exception {
        assertEquals(card3.getValueAsString(), "Ace");
    }

    @Test
    public void testGetValueAsShortString3() throws Exception {
        assertEquals(card3.getValueAsShortString(), "A");
    }

    @Test
    public void testGetSuit3() throws Exception {
        assertEquals(card3.getSuit(), 1);
    }

    @Test
    public void testGetSuitAsString3() throws Exception {
        assertEquals(card3.getSuitAsString(), "Diamonds");
    }

    @Test
    public void testGetDeck3() throws Exception {
        assertEquals(card3.getDeck(), 2);
    }

    @Test
    public void testGetAsset3() throws Exception {
        assertEquals(card3.getAsset(), "decks/default/1/A.svg");
    }

}
