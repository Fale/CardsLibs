package cc.locati.cards.libs.rummy;

import java.lang.reflect.Array;
import java.util.Arrays;

import cc.locati.cards.libs.Deck;
import cc.locati.cards.libs.Discarded;
import cc.locati.cards.libs.Player;

/**
 * Created by fale on 20/04/14.
 */
public class Game {

    final static int MIN_PLAYERS = 2;
    final static int MAX_PLAYERS = 5;
    final static int DEFAULT_PLAYERS = 2;

    final static int INIT_CARDS_DISCARDED = 1;
    final static int INIT_CARDS_HANDLED = 13;

    Player[] players;
    private int playersNumber;

    Deck deck;
    Discarded discarded;

    /**
     * Create a new game with two players.
     */
    public Game() {
        this(DEFAULT_PLAYERS);
    }

    /**
     * Create a new game.
     * @param playersCount Number of players
     */
    public Game(int playersCount) {
        if (playersCount < MIN_PLAYERS)
            throw new IllegalArgumentException("Too few players");
        if (playersCount > MAX_PLAYERS)
            throw new IllegalArgumentException("Too many players");
        // Create Deck
        deck = new Deck(2, true);
        //deck.shuffle();
        // Create Players and serve cards
        playersNumber = playersCount;
        players = new Player[playersCount];
        for(int i = 0; i < playersCount; i++)
        {
            players[i] = new Player(i);
        }
        for(int c = 0; c < INIT_CARDS_HANDLED; c++)
        {
            for(int p = 0; p < playersCount; p++)
            {
                players[p].drawCard(deck.dealCard());
            }
        }
        // Create Discarded and fill if necessary
        discarded = new Discarded();
        for (int c = 0; c < INIT_CARDS_DISCARDED; c++)
        {
            discarded.addCard(deck.dealCard());
        }
    }

    /**
     * Get the number of players playing.
     * @return Number of players
     */
    public int getPlayersNumber() {
        return playersNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck\n");
        sb.append(deck.toString());
        sb.append("\n");
        sb.append("Discarded\n");
        sb.append(discarded.toString());
        sb.append("\n");
        for(int p = 0; p < getPlayersNumber(); p++)
        {
            sb.append("Player ");
            sb.append(p);
            sb.append("\n");
            sb.append(players[p].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
