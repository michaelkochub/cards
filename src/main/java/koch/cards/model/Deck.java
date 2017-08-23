package koch.cards.model;

import java.util.List;

/**
 * Represents a standard 52-card deck
 * 
 * @author michaelkochub
 */
public class Deck {
  List<Card> cards;
  
  public Deck(List<Card> cards) {
    this.cards = cards;
  }
}
