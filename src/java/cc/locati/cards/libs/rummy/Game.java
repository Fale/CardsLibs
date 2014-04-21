package cc.locati.cards.libs.rummy;

import cc.locati.cards.libs.Deck;
import cc.locati.cards.libs.Player;

/**
 * Created by fale on 20/04/14.
 */
public class Game {

    final static int MIN_PLAYERS = 2;
    final static int MAX_PLAYERS = 5;
    final static int DEFAULT_PLAYERS = 2;

    Player[] players;
    private int playersNumber;

    Deck deck;

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
        deck = new Deck(2, true);
        Player[] players = new Player[playersCount];
        for(int i = 0; i < playersCount; i++)
        {
            players[i] = new Player(i);
        }
        playersNumber = playersCount;
    }

    /**
     * Get the number of players playing.
     * @return Number of players
     */
    public int getPlayersNumber() {
        return playersNumber;
    }


}
