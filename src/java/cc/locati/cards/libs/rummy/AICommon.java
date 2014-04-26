package cc.locati.cards.libs.rummy;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import cc.locati.cards.libs.Card;
import cc.locati.cards.libs.CardsGroup;
import cc.locati.cards.libs.Deck;
import cc.locati.cards.libs.Discarded;
import cc.locati.cards.libs.Hand;
import cc.locati.cards.libs.Player;
import cc.locati.cards.libs.Table;

/**
 * Created by fale on 24/04/14.
 */
public class AICommon {

    private Player player;
    private List<Player> players;
    private Discarded discarded;
    private Deck deck;

    public AICommon(List<Player> players, Deck deck, Discarded discarded, int playerId)
    {
        /*player = players.get(playerId);
        players.remove(playerId);
        this.players = players;
        this.discarded = discarded;
        this.deck = deck;*/
    }

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
