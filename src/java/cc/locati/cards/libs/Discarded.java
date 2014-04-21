package cc.locati.cards.libs;

import java.util.ArrayList;

/**
 * Created by fale on 21/04/14.
 */
public class Discarded {

    /**
     * An array of cards.
     */
    private ArrayList<Card> discarded;

    /**
     * Create a discarded pile
     */
    public Discarded() {
        discarded = new ArrayList<Card>();
    }

    /**
     * Get the number of cards in the discarded pile
     * @return Number of cards that have been discarded
     */
    public int getCardsNumber() {
        return discarded.size();
    }

    /**
     * Add a Card to the Discard pile
     * @param card Card to be added to the Discarded pile
     */
    public void addCard(Card card) {
        discarded.add(card);
    }

    /**
     * Remove a Card from the Discard pile
     * @param card Card to be deleted from the Discarded pile
     */
    public void removeCard(Card card) {
        discarded.remove(card);
    }

    /**
     * Remove a Card from the Discard pile
     * @param position Card to be deleted from the Discard pile
     */
    public void removeCard(int position) {
        discarded.remove(position);
    }

    /**
     * Remove last Card of the Discarded pile
     */
    public void removeLastCard() {
        discarded.remove(getCardsNumber());
    }

    /**
     * Get last Card of the pile
     * @return Last Card of the pile
     */
    public Card getLastCard() {
        return discarded.get(getCardsNumber());
    }

}
