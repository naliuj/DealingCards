package dealingpoker;

import java.util.List;

/**
 *
 * @author julian
 */
public class DealingPoker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game(5);
        game.deal();

        System.out.println("-------------------------------------------------");
        game.getPlayers().forEach((p) -> {
            p.printHand();
            System.out.println("-------------------------------------------------");

        });
        
    }
    
}
