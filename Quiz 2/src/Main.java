import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        Player heathcliff = new Player(0, "Heathcliff", 999);
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpdeskjet = new Player(3, "HPDeskjet", 34);

        PlayerLinkList playerLinkedList = new PlayerLinkList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpdeskjet);

        playerLinkedList.addToFront(heathcliff);

        System.out.println("--- Initial List ---");
        playerLinkedList.printList();

        System.out.println("\n--- Testing removal ---");
        PlayerNode removed = playerLinkedList.removeFirst();
        System.out.println("Removed: " + removed.getPlayer().getName());
        playerLinkedList.printList();

        System.out.println("\n--- Testing search functions ---");
        System.out.println("List contains 'Asuna': " + playerLinkedList.contains(asuna));
        System.out.println("'LethalBacon' is at index: " + playerLinkedList.indexOf(lethalBacon));

    }
}
