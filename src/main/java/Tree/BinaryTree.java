package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public static List<Node> inOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Node> list = new ArrayList<>();
        list.addAll(inOrder(root.getLeft()));
        list.add(root);
        list.addAll(inOrder(root.getRight()));
        return list;
    }

    public static List<Node> preOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Node> list = new ArrayList<>();
        list.add(root);
        list.addAll(preOrder(root.getLeft()));
        list.addAll(preOrder(root.getRight()));
        return list;
    }

    public static List<Node> postOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Node> list = new ArrayList<>();
        list.addAll(postOrder(root.getLeft()));
        list.addAll(postOrder(root.getRight()));
        list.add(root);
        return list;
    }
}

