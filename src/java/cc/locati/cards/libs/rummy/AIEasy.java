package cc.locati.cards.libs.rummy;

import java.util.List;

import cc.locati.cards.libs.Card;
import cc.locati.cards.libs.Deck;
import cc.locati.cards.libs.Discarded;
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

        return false;
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
}
