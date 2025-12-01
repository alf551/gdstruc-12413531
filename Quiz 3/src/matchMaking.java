import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class matchMaking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();
        Queue<String> lobby = new LinkedList<>();

        int gamesCreated = 0;
        int totalPlayersJoined = 0;

        System.out.println("Matchmaking System Online.");

        while (gamesCreated < 10) {
            System.out.print("Press ENTER to end turn and spawn players...");
            input.nextLine();

            int playersArriving = randomizer.nextInt(7) + 1;
            System.out.println("Players joined: " + playersArriving);

            for (int i = 0; i < playersArriving; i++) {
                totalPlayersJoined++;
                lobby.add("Player " + totalPlayersJoined);
            }

            System.out.println("Current Queue: " + lobby);

            while (lobby.size() >= 5) {
                if (gamesCreated == 10) {
                    break;
                }

                gamesCreated++;
                System.out.println("\n--- Match " + gamesCreated + " Found! ---");
                System.out.println("Players entering game:");

                for (int i = 0; i < 5; i++) {
                    System.out.println(lobby.remove());
                }
                System.out.println("-----------------------------");
            }
        }

        System.out.println("10 Games successfully created. Shutting down.");
    }
}