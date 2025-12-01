public class CardStack {

    private class Node {
        Card cardData;
        Node nextNode;
    }

    private Node top;
    private int currentSize;

    public CardStack() {
        top = null;
        currentSize = 0;
    }

    public void push(Card c) {
        Node n = new Node();
        n.cardData = c;
        n.nextNode = top;
        top = n;
        currentSize++;
    }

    public Card pop() {
        if (top == null) {
            return null;
        }
        Card temp = top.cardData;
        top = top.nextNode;
        currentSize--;
        return temp;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getCount() {
        return currentSize;
    }
}