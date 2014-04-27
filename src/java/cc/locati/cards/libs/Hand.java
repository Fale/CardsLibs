package cc.locati.cards.libs;

/**
 * An object of type Hand represents a hand of cards.  The
 * cards belong to the class Card.  A hand is empty when it
 * is created, and any number of cards can be added to it.
 */


import java.util.ArrayList;
import java.util.List;

import cc.locati.cards.libs.Card;

public class Hand {

    private List<Card> hand;   // The cards in the hand.
    private int maxCardNumber;

    /**
     * Create a hand that is initially empty.
     */
    public Hand() {
        hand = new ArrayList<Card>();
    }

    /**
     * Remove all cards from the hand, leaving it empty.
     */
    public void clear() {
        hand.clear();
    }

    /**
     * Add a card to the hand.  It is added at the end of the current hand.
     * @param c the non-null card to be added.
     * @throws NullPointerException if the parameter c is null.
     */
    public void addCard(Card c) {
        if (c == null)
            throw new NullPointerException("Can't add a null card to a hand.");
        hand.add(c);
    }

    /**
     * Remove a card from the hand, if present.
     * @param c the card to be removed.  If c is null or if the card is not in
     * the hand, then nothing is done.
     */
    public void removeCard(Card c) {
        hand.remove(c);
    }

    /**
     * Remove the card in a specified position from the hand.
     * @param position the position of the card that is to be removed, where
     * positions are starting from zero.
     * @throws IllegalArgumentException if the position does not exist in
     * the hand, that is if the position is less than 0 or greater than
     * or equal to the number of cards in the hand.
     */
    public void removeCard(int position) {
        if (position < 0 || position >= hand.size())
            throw new IllegalArgumentException("Position does not exist in hand: "
                    + position);
        hand.remove(position);
    }

    /**
     * Remove a bunch of cards in a single command
     * @param cards Cards to be removed
     */
    public void removeCards(List<Card> cards) {
        for (Card card:cards) {
            removeCard(card);
        }
    }

    /**
     * Remove all cards but the Cards in the ArrayList
     * @param newHand Cards to keep in the hand
     */
    public void removeAllBut(ArrayList<Card> newHand) {
        hand = newHand;
    }

    /**
     * Returns the number of cards in the hand.
     */
    public int getCardCount() {
        return hand.size();
    }

    /**
     * Gets the card in a specified position in the hand.  (Note that this card
     * is not removed from the hand!)
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand
     */
    public Card getCard(int position) {
        if (position < 0 || position >= hand.size())
            throw new IllegalArgumentException("Position does not exist in hand: "
                    + position);
        return (Card)hand.get(position);
    }

    /**
     * Sorts the cards in the hand so that cards of the same suit are
     * grouped together, and within a suit the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortBySuit() {
        List<Card> newHand = new ArrayList<Card>();
        while (hand.size() > 0) {
            int pos = 0;  // Position of minimal card.
            Card c = (Card)hand.get(0);  // Minimal card.
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = (Card)hand.get(i);
                if ( c1.getSuit() < c.getSuit() ||
                        (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue()) ) {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
        }
        hand = newHand;
    }

    /**
     * Sorts the cards in the hand so that cards of the same value are
     * grouped together.  Cards with the same value are sorted by suit.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByValue() {
        List<Card> newHand = new ArrayList<Card>();
        while (hand.size() > 0) {
            int pos = 0;  // Position of minimal card.
            Card c = (Card)hand.get(0);  // Minimal card.
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = (Card)hand.get(i);
                if ( c1.getValue() < c.getValue() ||
                        (c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit()) ) {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
        }
        hand = newHand;
    }


    public int getCountByNumberWithoutDoubles(int number) {
        int count = 0;
        boolean suits[] = new boolean[4];
        for (int card = 0; card < getCardCount(); card++) {
            if (getCard(card).getValue() == number
                    && getCard(card).getSuit() < 4)
                if (!suits[getCard(card).getSuit()]){
                    count++;
                    suits[getCard(card).getSuit()] = true;
                }
        }
        return count;
    }

    public int getCountByNumber(int number) {
        int count = 0;
        for (int card = 0; card < getCardCount(); card++) {
            if (getCard(card).getValue() == number
                && getCard(card).getSuit() < 4)
                    count++;
        }
        return count;
    }

    public int getCountBySuit (int suit) {
        int count = 0;
        for (int card = 0; card < getCardCount(); card++) {
            if (getCard(card).getSuit() == suit)
                count++;
        }
        return count;
    }

    public int[] countByNumber() {
        int[] groups = new int[14];
        for (int value = 1; value <= 13; value++) {
            groups[value] = getCountByNumber(value);
        }
        return groups;
    }

    public int[] countByNumberWithoutDoubles() {
        int[] groups = new int[14];
        for (int value = 1; value <= 13; value++) {
            groups[value] = getCountByNumberWithoutDoubles(value);
        }
        return groups;
    }

    public List<CardsGroup> groupByNumber() {
        List<CardsGroup> groups = new ArrayList<CardsGroup>();
        for (int value = 1; value < 13; value++) {
            CardsGroup cardsGroup = new CardsGroup();
            cardsGroup.value = value;
            cardsGroup.count = getCountByNumber(value);
            groups.add(cardsGroup);
        }
        return groups;
    }

    public List<CardsGroup> groupBySuit() {
        List<CardsGroup> groups = new ArrayList<CardsGroup>();
        for (int value = 1; value < 13; value++) {
            CardsGroup cardsGroup = new CardsGroup();
            cardsGroup.value = value;
            cardsGroup.count = getCountBySuit(value);
            groups.add(cardsGroup);
        }
        return groups;
    }

    /**
     * Count the number of pairs.
     * @return number of pairs
     */
    public int getCountPairs() {
        return getCountGroupByNumber(2);
    }

    /**
     * Count the number of triples.
     * @return number of triples
     */
    public int getCountTriples() {
        return getCountGroupByNumber(3);
    }

    /**
     * Count the number of pockers
     * @return number of pokers
     */
    public int getCountPokers() {
        return getCountGroupByNumber(4);
    }

    /**
     * Count the number of groups created by N cards.
     * @param cardsNumber Number of cards in each group
     * @return number of groups witn the given number of card
     */
    public int getCountGroupByNumber(int cardsNumber) {
        int groups = 0;
        int cards[] = countByNumberWithoutDoubles();
        for (int card: cards)
            if (card == cardsNumber)
                groups ++;
        return groups;
    }

    /**
     * Set the maximum number of Cards holdable in Hand
     * @param maxCardNumberValue Maximum number of Card holdable in Hand
     */
    public void setMaxCardNumber(int maxCardNumberValue) {
        maxCardNumber = maxCardNumberValue;
    }

    /**
     * Get the maximum number of Cards holdable in Hand
     * @return Maximum number of Card holdable in Hand
     */
    public int getMaxCardNumber() {
        return maxCardNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int c = 0; c < getCardCount(); c++)
        {
            sb.append(c);
            sb.append(" ");
            sb.append(getCard(c));
            sb.append("\n");
        }
        return sb.toString();
    }
}