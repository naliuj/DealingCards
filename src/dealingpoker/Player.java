package dealingpoker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julian
 */
public class Player {
    
    private List hand = new ArrayList<>();
    private Deck deck;
    
    /**
     * Picks the top 5 cards from the deck of cards and adds them to the
     * player's hand.
     */
    public void newHand() {
        for (int i = 0; i < 7; i++) {
            Card card = deck.takeCard();
            hand.add(card);
        }
    }
    
    /**
     * Prints out each card that the player has in the deck.
     */
    public void printHand() {
        hand.forEach((c) -> System.out.println(c.toString()));
    }
    
    /**
     * This constructor allows the user to pass a Deck object to player.
     * @param deck The deck that the player will draw cards from.
     */
    public Player(Deck deck) {
        this.deck = deck;
    }
    
}
