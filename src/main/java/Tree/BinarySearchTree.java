package Tree;

import java.util.List;

public class BinarySearchTree {


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
