class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

public class binarytree{

    public static Node createNode(int value) {
        return new Node(value);
    }

    public static void main(String[] args) {
        Node root = createNode(10);
        root.left = createNode(20);
        root.right = createNode(30);
        root.left.left = createNode(40);
        root.left.right = createNode(50);

        System.out.println("Tree created successfully");
    }
}
