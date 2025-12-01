public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.addNode("Heathcliff");
        myList.addNode("Asuna");
        myList.addNode("LethalBacon");
        myList.addNode("HPDeskjet");

        myList.printList();

        System.out.println("\nRemoving first element...");
        myList.removeFirstElement();
        myList.printList();

        String searchOne = "Asuna";
        System.out.println("\nContains " + searchOne + "? " + myList.contains(searchOne));

        String searchTwo = "LethalBacon";
        System.out.println("Index of " + searchTwo + ": " + myList.indexOf(searchTwo));

        String searchThree = "Heathcliff";
        System.out.println("Index of " + searchThree + ": " + myList.indexOf(searchThree));
    }
}