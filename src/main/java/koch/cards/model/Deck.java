package koch.cards.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a standard 52-card deck
 * 
 * @author michaelkochub
 */
public class Deck {
  // the top of the deck has index 0
  private static final int TOP_CARD_INDEX = 0;
  private static final int MAX_NUM_CARDS = 52;
  private final List<Card> cards;
  
  public Deck() {
    cards = new ArrayList<Card>();
  }
  
  /**
   * 
   * @param newCards cards to replace existing cards in deck
   */
  public void replaceCards(List<Card> newCards) {
    wipeCards();
    cards.addAll(newCards);
  }
  
  /**
   * add card to deck
   * @param card card to be added
   * @return whether card was added to deck
   */
  public boolean addCard(Card card) {
      if (cards.size() <  MAX_NUM_CARDS) {
        cards.add(card);   
        return true;
      }
      return false;
  }
  
  /**
   * 
   * @return is cards is not empty
   */
  public boolean hasCards() {
      return !cards.isEmpty();
  }
  
  /**
   * 
   * @return number of cards remaining in deck
   */
  public int getNumCardsRemaining() {
      return cards.size();
  }
  
  /**
   * 
   * @param cardIndex
   * @return card removed from deck
   */
  public Card removeCard(int cardIndex) {
      return hasCards() ? cards.remove(cardIndex) : null;
  }
  
  /**
   * 
   * @return card from top of the deck, or null if deck is empty
   */
  public Card removeTopCard() {
      return removeCard(TOP_CARD_INDEX);
  }
  
  /**
   * remove all cards from deck
   */
  public void wipeCards() {
      cards.clear();
  }
   
}
