public class Tree {
    private Node root;

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            root.insert(data);
        }
    }

    public Node getMin() {
        if (root == null) {
            return null;
        }
        return root.findMin();
    }

    public Node getMax() {
        if (root == null) {
            return null;
        }
        return root.findMax();
    }

    public void traverseInOrderDescending() {
        if (root != null) {
            root.traverseInOrderDescending();
        }
        System.out.println();
    }
}