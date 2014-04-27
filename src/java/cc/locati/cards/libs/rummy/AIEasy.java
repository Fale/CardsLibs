package cc.locati.cards.libs.rummy;

import java.util.List;

import cc.locati.cards.libs.Card;
import cc.locati.cards.libs.Deck;
import cc.locati.cards.libs.Discarded;
import cc.locati.cards.libs.Hand;
import cc.locati.cards.libs.Player;

/**
 * Created by fale on 24/04/14.
 */
public class AIEasy extends AICommon implements AI {

    public AIEasy (List<Player> players, Deck deck, Discarded discarded, int playerId) {
        super(players, deck, discarded, playerId);
    }

    @Override
    public boolean drawFromDeck() {
        Hand possibleHand = player.getHand();
        possibleHand.addCard(discarded.getLastCard());
        if (!player.getTable().hasItems()) {
            if (countPoints(possibleHand) >= Game.POINTS_TO_OPEN)
                return false;
        } else {
            if (countPoints(player.getHand()) < countPoints(possibleHand))
                // The card should also go down immediately
                return false;
        }
        return true;
    }

    @Override
    public List<List<Card>> getCardsToOwnTable() {
        return null;
    }

    @Override
    public List<List<Card>> getCardsToOtherTables() {
        return null;
    }

    @Override
    public Card getDiscard() {
        return null;
    }

    /**
     * Count point of current Player's Hand
     * @return points of current Player's Hand
     */
    protected int countPoints() {
        return countPoints(player.getHand());
    }

    /**
     * Count Points in a Hand
     * @param hand Hand in which count points
     * @return points of the Hand
     */
    protected int countPoints(Hand hand) {
        int points = 0;
        int[] cards = hand.countByNumber();

        for (int c = 1; c < 13; c++) {
            if (cards[c] >= 3) {
                if (c == 1) {
                    points += 11 * cards[c];
                    continue;
                }
                if (c >= 11) {
                    points += 10 * cards[c];
                    continue;
                }
                points += c * cards[c];
            }
        }
        return points;
    }

}
