public class Main {
    public static void main(String[] args) {
        Tree myTree = new Tree();

        myTree.insert(50);
        myTree.insert(30);
        myTree.insert(20);
        myTree.insert(40);
        myTree.insert(70);
        myTree.insert(60);
        myTree.insert(80);

        System.out.println("Tree created.");

        Node minNode = myTree.getMin();
        if (minNode != null) {
            System.out.println("Min value: " + minNode.data);
        }

        Node maxNode = myTree.getMax();
        if (maxNode != null) {
            System.out.println("Max value: " + maxNode.data);
        }

        System.out.print("Descending Order: ");
        myTree.traverseInOrderDescending();
    }
}