package cc.locati.cards.libs;

/**
 * Each player has characteristics that make possible to build more integrated games.
 */
public class Player {

    Table table;
    Hand hand;
    String name;
    int intelligence;
    int id;

    /**
     * Create a new Player
     * @param nameValue Name of the Player
     */
    public Player(String nameValue) {
        this(nameValue, 0, 0, false);
    }

    /**
     * Create a new Player
     * @param playerNo ID of the player
     */
    public Player(int playerNo) {
        this("", playerNo, 0, false);
    }

    /**
     * Create a new Player
     * @param nameValue Name of the Player
     * @param intelligenceValue Intelligence of the Player
     */
    public Player(String nameValue, int intelligenceValue) {
        this(nameValue, 0, intelligenceValue, false);
    }

    /**
     * Create a new player
     * @param nameValue Name of the Player
     * @param playerNo ID of the player
     * @param intelligenceValue Intelligence of the Player
     * @param tableValue Player table presence
     */
    public Player(String nameValue, int playerNo, int intelligenceValue, boolean tableValue) {
        if (nameValue != "")
            name = nameValue;
        if (tableValue)
            table = new Table();
        id = playerNo;
        intelligence = intelligenceValue;
        hand = new Hand();
    }

    /**
     * Get the Player's hand
     * @return Player's hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Set a hand to Player
     * @param handValue new Player's hand
     */
    public void setHand(Hand handValue) {
        hand = handValue;
    }

    /**
     * Get the Player's table
     * @return Player's table
     */
    public Table getTable() {
        return table;
    }

    /**
     * Set a table to Player
     * @param tableValue New Player's table
     */
    public void setTable(Table tableValue) {
        table = tableValue;
    }

    /**
     * Get the Player's name
     * @return Name of the Player
     */
    public String getName() {
        return name;
    }

    /**
     * Set the Player's name
     * @param nameValue Name of the Player
     */
    public void setName(String nameValue) {
        name = nameValue;
    }

    /**
     * Get the Player's Id
     * @return Id of the Player
     */
    public int getId() {
        return id;
    }

    /**
     * Set the Player's Id
     * @param idValue Id of the Player
     */
    public void setId(int idValue) {
        id = idValue;
    }

    /**
     * Add a card to Player's Hand
     * @param card Card to add to Player's Hand
     */
    public void drawCard(Card card) {
        hand.addCard(card);
    }

    /**
     * Ouput the Player to string for debug purpose
     * @return The Player string
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hand\n");
        sb.append(hand.toString());
        return sb.toString();
    }
}
