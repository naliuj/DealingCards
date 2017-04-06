package dealingpoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * The Deck object holds the Cards and allows for the drawing of Cards from the
 * Deck,
 * @author julian
 */
public class Deck {
    
    private List<Card> cards = new ArrayList<>();
    final private Random RAND = new Random();
    
    /**
     * Creates a new deck of cards in order and puts them in the cards List.
     */
    private void makeDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }
    
    /**
     * Shuffles the cards in the deck so that they are not all in order.
     */
    public void shuffle() {
        Collections.shuffle(cards, RAND);
    }
    
    /**
     * Prints the cards in the deck in the order that the cards appear in the
     * deck.
     */
    public void print() {
        cards.forEach((c) -> System.out.println(c.toString()));
    }
    
    /**
     * Returns the top card in the deck and removes the card from the deck so it
     * can not be drawn again.
     * @return The first Card in the Deck.
     */
    public Card takeCard() {
        Card newCard = (Card) cards.get(0);
        cards.remove(0);
        return newCard;
    }
    
    /**
     * @param shuffle Boolean to determine whether or not to shuffle the deck.
     */
    public Deck(boolean shuffle) {
        makeDeck();
        if (shuffle) {
            shuffle();
        }
    }
    
    public Deck() {
        this(true);
    }
}
