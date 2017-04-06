package dealingpoker;

/**
 * The card class. Each card has a Suit and a Rank.
 * @author julian
 */
public class Card {
    
    private Suit suit;
    private Rank rank;
    
    /**
     * Method to get the Suit of a card.
     * @return Suit of the card.
     */
    public Suit getSuit() {
        return suit;
    }
    
    /**
     * Method to get the Rank of a card.
     * @return Rank of a card.
     */
    public Rank getRank() {
        return rank;
    }
    
    /**
     * Override of the toString() method that will return the Card as a String.
     * @return Card in the form of a String.
     */
    @Override
    public String toString() {
        return String.format("%s of %s", rank, suit);
    }
    
    /**
     * This constructor allows the user to define the Suit and Rank of the card
     * when they initialize the Card object.
     * @param suit The suit of the card.
     * @param rank The rank of the card.
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
}
