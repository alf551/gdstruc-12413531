public class PlayerLinkList {
    private PlayerNode head;
    private PlayerNode tail;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        if (head == null) {
            head = playerNode;
            tail = playerNode;
        } else {
            playerNode.setNextPlayer(head);
            head.setPreviousPlayer(playerNode);
            head = playerNode;
        }
        size++;
    }

    public PlayerNode removeFirst() {
        if (head == null) {
            return null;
        }
        PlayerNode removedNode = head;
        head = head.getNextPlayer();
        removedNode.setNextPlayer(null);

        if (head != null) {
            head.setPreviousPlayer(null);
        } else {
            tail = null;
        }
        size--;
        return removedNode;
    }

    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD <=> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.println("Size: " + size);
    }

}