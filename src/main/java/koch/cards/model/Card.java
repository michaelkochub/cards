package koch.cards.model;

/**
 * Represents one card, which has a rank and a suit
 *
 * @author michaelkochub
 */
public class Card {
  private Rank rank;
  private Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  @Override
  public String toString() {
    return String.format("%s of %s", this.rank, this.suit);
  }
  
}
