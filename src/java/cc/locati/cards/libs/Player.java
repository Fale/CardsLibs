package cc.locati.cards.libs;

/**
 * Each player has characteristics that make possible to build more integrated games.
 */
public class Player {

    Table table;
    Hand hand;
    String name;
    int intelligence;

    /**
     * Create a new Player
     * @param nameValue Name of the Player
     */
    public Player(String nameValue) {
        this(nameValue, 0, false);
    }

    /**
     * Create a new Player
     * @param nameValue Name of the Player
     * @param intelligenceValue Intelligence of the Player
     */
    public Player(String nameValue, int intelligenceValue) {
        this(nameValue, intelligenceValue, false);
    }

    /**
     * Create a new player
     * @param nameValue Name of the Player
     * @param intelligenceValue Intelligence of the Player
     * @param tableValue Player table presence
     */
    public Player(String nameValue, int intelligenceValue, boolean tableValue) {
        if (nameValue != "")
            name = nameValue;
        if (tableValue)
            table = new Table();
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


}
