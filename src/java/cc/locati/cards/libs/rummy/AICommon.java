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

    protected Player player;
    protected List<Player> players;
    protected Discarded discarded;
    protected Deck deck;

    public AICommon(List<Player> players, Deck deck, Discarded discarded, int playerId)
    {
        if (players.size() >= playerId + 1) {
            player = players.get(playerId);
            players.remove(playerId);
        } else
            player = new Player(playerId);
        this.players = players;
        this.discarded = discarded;
        this.deck = deck;
    }

}
