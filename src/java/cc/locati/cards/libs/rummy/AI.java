package cc.locati.cards.libs.rummy;

import java.util.List;

import cc.locati.cards.libs.Card;

/**
 * Created by fale on 24/04/14.
 */
public interface AI {
    boolean drawFromDeck();
    List<List<Card>> getCardsToOwnTable();
    List<List<Card>> getCardsToOtherTables();
    Card getDiscard();
}
