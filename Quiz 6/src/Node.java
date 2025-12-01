public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int data) {
        if (data < this.data) {
            if (left == null) {
                left = new Node(data);
            } else {
                left.insert(data);
            }
        } else {
            if (right == null) {
                right = new Node(data);
            } else {
                right.insert(data);
            }
        }
    }

    public void traverseInOrderDescending() {
        if (right != null) {
            right.traverseInOrderDescending();
        }
        System.out.print(data + " ");
        if (left != null) {
            left.traverseInOrderDescending();
        }
    }

    public Node findMin() {
        if (left == null) {
            return this;
        }
        return left.findMin();
    }

    public Node findMax() {
        if (right == null) {
            return this;
        }
        return right.findMax();
    }
}