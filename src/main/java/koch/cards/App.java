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
    
    // Print out randomly shuffled deck and then
    // two 'no cards' like '52: null' and '53: null'
    printCards(dealer, SIZE + 2);
    
    dealer.refreshDeck();
    
    printCards(dealer, 10);
    
    dealer.shuffle();
    
    printCards(dealer, 5);
    
  }
  
  public static void printCards(Dealer dealer, int numIterations) {
    System.out.println("-------------------");
    for (int i = 0; i < numIterations; i++) {
      System.out.println(String.format("%d: %s", i, dealer.dealOneCard()));
    }    
  }
}
