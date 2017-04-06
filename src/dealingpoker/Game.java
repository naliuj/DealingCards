package dealingpoker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julian
 */
public class Game {
    
    private Deck deck = new Deck();
    private List<Player> players = new ArrayList<>();
    
    /**
     * Gives 7 cards to each player's hands.
     */
    public void deal() {
        players.forEach((p) -> {
            p.newHand();
        });
    }
    
    /**
     * Method to retrieve the List of players in the game.
     * @return A List populated with Player objects.
     */
    public List<Player> getPlayers() {
        return players;
    }
    
    /**
     * This constructor allows the user to define the amount of players that
     * will play in the game, and adds that many new players to the players
     * List.
     * @param playerCount The amount of players playing the game.
     */
    public Game(int playerCount) {
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player(deck));
        }
    }
    
}
