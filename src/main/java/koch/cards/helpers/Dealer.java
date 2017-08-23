package koch.cards.helpers;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import koch.cards.model.Card;
import koch.cards.model.Deck;
import koch.cards.model.Rank;
import koch.cards.model.Suit;

/**
 * Dealer class responsible for shuffling and dealing cards as well as instantiating the deck. The
 * dealer in effect is the deck manager. The dealer can deal a card, shuffle the deck, and
 * regenerate the deck. The dealer cannot show the deck... although that would be helpful
 * for the players.
 * 
 * @author michaelkochub
 */
public final class Dealer {

  private static Dealer dealer;
  private static final Random RANDOM = new Random();
  private final Deck deck = new Deck();

  private Dealer() { }

  /**
   * 
   * @return lazily instantiated dealer
   */
  public static Dealer getDealer() {
    if (dealer == null) {
      dealer = new Dealer();
      dealer.populateDeck();
      dealer.shuffle();
    }
    return dealer;
  }

  private void populateDeck() {
    for (Rank rank : Rank.values()) {
      for (Suit suit : Suit.values()) {
        deck.getCards().add(new Card(rank, suit));
      }
    }
  }

  /**
   * shuffle cards by randomly picking one card at a time from original
   * deck and putting that into new deck, returning the new deck once
   * the original deck is empty
   */
  public void shuffle() {    
    int size;
    List<Card> shuffledCards = new ArrayList<Card>();
    while (!deck.getCards().isEmpty()) {
      size = deck.getCards().size();
      Card randomCard = deck.getCards().remove(RANDOM.nextInt(size));
      shuffledCards.add(randomCard);
    }
    deck.setCards(shuffledCards);
  }

  /**
   * empty the deck, re-populate it, and shuffle it. this restores deck
   * back to 52 cards.
   */
  public void refreshDeck() {
    deck.getCards().clear();
    populateDeck();
    shuffle();
  }

  /**
   * removes card from deck and deals it. when deck is empty, return null.
   * invoking this method should be followed by a null-check usually
   * @return dealt card
   */
  public Card dealOneCard() {
    return deck.getCards().isEmpty() ? null : deck.getCards().remove(0);
  }

}
