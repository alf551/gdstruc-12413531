import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MidtermGame {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        CardStack playerDeck = new CardStack();
        CardStack discardPile = new CardStack();
        ArrayList<Card> playerHand = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            playerDeck.push(new Card("Goblin " + i));
        }

        System.out.println("Game Started. Deck loaded with 30 cards.");

        while (!playerDeck.isEmpty()) {
            System.out.println("--------------------------------");
            System.out.println("Press Enter to start next turn...");
            scanner.nextLine();

            int command = rand.nextInt(3) + 1;
            int x = rand.nextInt(5) + 1;

            if (command == 1) {
                System.out.println("Command: Draw " + x + " cards.");
                for (int i = 0; i < x; i++) {
                    if (!playerDeck.isEmpty()) {
                        Card drawn = playerDeck.pop();
                        playerHand.add(drawn);
                    } else {
                        System.out.println("Deck is empty!");
                        break;
                    }
                }
            }
            else if (command == 2) {
                System.out.println("Command: Discard " + x + " cards.");
                for (int i = 0; i < x; i++) {
                    if (playerHand.size() > 0) {
                        Card removed = playerHand.remove(0);
                        discardPile.push(removed);
                    } else {
                        System.out.println("Hand is empty, cannot discard.");
                        break;
                    }
                }
            }
            else if (command == 3) {
                System.out.println("Command: Get " + x + " cards from Discard Pile.");
                for (int i = 0; i < x; i++) {
                    if (!discardPile.isEmpty()) {
                        Card recovered = discardPile.pop();
                        playerHand.add(recovered);
                    } else {
                        System.out.println("Discard pile is empty!");
                        break;
                    }
                }
            }

            System.out.println("\n--- Status Report ---");
            System.out.print("Current Hand: ");
            if (playerHand.isEmpty()) {
                System.out.print("[Empty]");
            }
            for (Card c : playerHand) {
                System.out.print(c.toString() + ", ");
            }
            System.out.println();
            System.out.println("Cards remaining in Deck: " + playerDeck.getCount());
            System.out.println("Cards in Discard Pile: " + discardPile.getCount());
        }

        System.out.println("--------------------------------");
        System.out.println("The Player Deck is empty. Game Over.");
    }
}