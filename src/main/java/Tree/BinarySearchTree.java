package Tree;

import java.util.List;

public class BinarySearchTree {

    public static void main(String[] args) {

        Node root = new Node(4);
        add(root, 2);
        add(root, 6);
        add(root, 1);
        add(root, 3);
        add(root, 5);
        add(root, 7);


        System.out.println("searching for " + 1);
        Node r = search(root, 1);
        System.out.println(r.getValue()); // 1

        System.out.println("searching for " + 2);
        r = search(root, 2);
        System.out.println(r.getValue()); // 2

        System.out.println("in order");
        for (Node n : BinaryTree.inOrder(root))
            System.out.println(n.getValue());

        System.out.println("pre order");
        for (Node n : BinaryTree.preOrder(root))
            System.out.println(n.getValue());

        System.out.println("post order");
        for (Node n : BinaryTree.postOrder(root))
            System.out.println(n.getValue());
    }

    public static void add(Node root, int value) {
        if (value <= root.getValue()) {
            if (root.getLeft() == null)
                root.setLeft(new Node(value));
            else
                add(root.getLeft(), value);
        } else {
            if (root.getRight() == null)
                root.setRight(new Node(value));
            else
                add(root.getRight(), value);
        }
    }

    public static Node search(Node root, int value) {
        if (root == null)
            return null;
        if (root.getValue() == value)
            return root;
        else if (value < root.getValue())
            return search(root.getLeft(), value);
        else
            return search(root.getRight(), value);
    }
}
