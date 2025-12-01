public class DoublyLinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    public void addNode(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public void removeFirstElement() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        size--;
    }

    public boolean contains(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(String data) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data.equals(data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void printList() {
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print("[" + current.data + "] <-> ");
            current = current.next;
        }
        System.out.println("NULL");
        System.out.println("Current Size: " + size);
    }
}