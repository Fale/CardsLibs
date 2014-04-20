package cc.locati.cards.libs.poker;

import java.util.ArrayList;

import cc.locati.cards.libs.Card;
import cc.locati.cards.libs.Deck;
import cc.locati.cards.libs.Hand;

public class Poker {

    private Deck deck;

    private Hand[] hands;

    public Poker() {
        this(2);
    }

    public Poker(int players) {
        deck.shuffle();
        while (players > 0) {
            for (int cards = 0; cards < 5; cards++) {
                hands[players].addCard(deck.dealCard());
            }
            players--;
        }
    }

    public void playerMove(int player) {
        // Choose
        // Act
    }

}
