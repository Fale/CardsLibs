package cc.locati.cards.libs;

import java.util.ArrayList;
import java.util.List;

/**
 * A table can be used in games that need to be able to put "down" stuff.
 * A table can be both shared or private of a player
 */
public class Table {

    List<Card[]> table;

    /**
     * Create new empty table
     */
    public Table()
    {
        table = new ArrayList<Card[]>();
    }

    /**
     * Check if the table has something on it
     * @return
     */
    public boolean hasItems()
    {
        if (table.size() > 0)
            return true;
        else
            return false;
    }
}
