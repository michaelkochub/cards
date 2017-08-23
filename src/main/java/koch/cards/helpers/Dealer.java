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
 * dealer in effect is the deck manager.
 * 
 * @author michaelkochub
 */
public class Dealer {

  private static Dealer dealer;
  private static Random random = new Random();
  private final Deck deck = new Deck();

  private Dealer() { }

  public static Dealer getDealer() {
    if (dealer == null) {
      dealer = new Dealer();
      dealer.populateDeck();
      dealer.shuffle();
    }
    return dealer;
  }

  public Deck getDeck() {
    return deck;
  }

  private void populateDeck() {
    for (Rank rank : Rank.values()) {
      for (Suit suit : Suit.values()) {
        dealer.deck.getCards().add(new Card(rank, suit));
      }
    }
  }

  public void shuffle() {    
    int size;
    List<Card> shuffledCards = new ArrayList<Card>();
    while (!dealer.deck.getCards().isEmpty()) {
      size = dealer.deck.getCards().size();
      Card randomCard = dealer.deck.getCards().remove(random.nextInt(size));
      shuffledCards.add(randomCard);
    }
    dealer.deck.setCards(shuffledCards);
  }

  public void refreshDeck() {
    dealer.deck.getCards().clear();
    dealer.populateDeck();
    dealer.shuffle();
  }

  public Card dealOneCard() {
    return dealer.deck.getCards().isEmpty() ? null : dealer.deck.getCards().remove(0);
  }

}
