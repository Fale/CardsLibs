package cc.locati.cards.libs.rummy;

import org.junit.Test;

import java.util.ArrayList;

import cc.locati.cards.libs.Card;
import cc.locati.cards.libs.Deck;
import cc.locati.cards.libs.Discarded;
import cc.locati.cards.libs.Hand;
import cc.locati.cards.libs.Player;

import static org.junit.Assert.*;

/**
 * Created by fale on 27/04/14.
 */
public class AIEasyTest {

    @Test
    public void countPointsZero() {
        Hand hand = new Hand();
        hand.addCard(new Card(1, 0, 0));
        hand.addCard(new Card(3, 0, 0));
        hand.addCard(new Card(2, 0, 0));
        hand.addCard(new Card(4, 0, 0));
        hand.addCard(new Card(5, 0, 0));
        hand.addCard(new Card(6, 0, 0));
        hand.addCard(new Card(7, 0, 0));
        hand.addCard(new Card(8, 0, 0));
        hand.addCard(new Card(9, 0, 0));
        hand.addCard(new Card(5, 0, 0));
        AIEasy easy = new AIEasy(new ArrayList<Player>(), new Deck(), new Discarded(), 0);
        assertEquals(easy.countPoints(hand), 0);
    }

    @Test
    public void countPointsThirty() {
        Hand hand = new Hand();
        hand.addCard(new Card(1, 0, 0));
        hand.addCard(new Card(3, 0, 0));
        hand.addCard(new Card(2, 0, 0));
        hand.addCard(new Card(4, 0, 0));
        hand.addCard(new Card(5, 0, 0));
        hand.addCard(new Card(6, 0, 0));
        hand.addCard(new Card(7, 0, 0));
        hand.addCard(new Card(8, 0, 0));
        hand.addCard(new Card(9, 0, 0));
        hand.addCard(new Card(5, 0, 0));
        hand.addCard(new Card(11, 0, 0));
        hand.addCard(new Card(11, 0, 0));
        hand.addCard(new Card(11, 0, 0));
        AIEasy easy = new AIEasy(new ArrayList<Player>(), new Deck(), new Discarded(), 0);
        assertEquals(easy.countPoints(hand), 30);
    }
}
