package koch.cards.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a standard 52-card deck
 * 
 * @author michaelkochub
 */
public class Deck {
  private List<Card> cards;
  
  public Deck() {
    this.cards = new ArrayList<Card>();
  }
  
  public Deck(List<Card> cards) {
    this.cards = cards;
  }
  
  public List<Card> getCards() {
    return cards;
  }
  
  public void setCards(List<Card> cards) {
    this.cards = cards;
  }
 
}
