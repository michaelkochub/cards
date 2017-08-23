package koch.cards;

import org.apache.log4j.Logger;
import koch.cards.helpers.Dealer;
import koch.cards.model.Card;

/**
 * Simple application to instantiate a deck, shuffle it, and deal cards one
 * at a time
 *
 * @author michaelkochub
 */
public class App {
  private static final int SIZE = 52;
  
  public static void main(String[] args) {
    Dealer dealer = Dealer.getDealer();
    dealer.shuffle();    
    
    for (int i = 0; i < SIZE; i++) {
      System.out.println(String.format("%d: %s", i, dealer.dealOneCard()));
    }
  }
}
