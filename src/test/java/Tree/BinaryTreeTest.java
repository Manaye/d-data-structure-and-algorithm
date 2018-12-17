package Tree;

import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeTest {

    @Test
    public void testInOrder() {

        Node root = new Node(4);
        BinarySearchTree.add(root, 2);
        BinarySearchTree.add(root, 6);
        BinarySearchTree.add(root, 1);
        BinarySearchTree.add(root, 3);
        BinarySearchTree.add(root, 5);
        BinarySearchTree.add(root, 7);

        List<Node> expected = Arrays.asList(
            new Node(1),
            new Node(2),
            new Node(3),
            new Node(4),
            new Node(5),
            new Node(6),
            new Node(7));

        List<Node> actual = BinaryTree.inOrder(root);
        Assert.assertTrue(actual.size() == 7);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testpreOrder() {
        Node root = new Node(4);
        BinarySearchTree.add(root, 2);
        BinarySearchTree.add(root, 6);
        BinarySearchTree.add(root, 1);
        BinarySearchTree.add(root, 3);
        BinarySearchTree.add(root, 5);
        BinarySearchTree.add(root, 7);

        List<Node> expected = Arrays.asList(
                new Node(4),
                new Node(2),
                new Node(1),
                new Node(3),
                new Node(6),
                new Node(5),
                new Node(7));

        List<Node> actual = BinaryTree.preOrder(root);
        Assert.assertTrue(actual.size() == 7);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testpostOrder() {
        Node root = new Node(4);
        BinarySearchTree.add(root, 2);
        BinarySearchTree.add(root, 6);
        BinarySearchTree.add(root, 1);
        BinarySearchTree.add(root, 3);
        BinarySearchTree.add(root, 5);
        BinarySearchTree.add(root, 7);

        List<Node> expected = Arrays.asList(
                new Node(1),
                new Node(3),
                new Node(2),
                new Node(5),
                new Node(7),
                new Node(6),
                new Node(4));

        List<Node> actual = BinaryTree.postOrder(root);
        Assert.assertTrue(actual.size() == 7);
        Assert.assertEquals(actual, expected);
    }
    }
