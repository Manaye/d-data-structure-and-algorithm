package fizzbuzztree;

public class Node {
    private int value;
    private Tree.Node left;
    private Tree.Node right;

    public Node (int value) {
        this(value, null, null);
    }

    public Node(int value, Tree.Node left, Tree.Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Tree.Node getLeft() {
        return left;
    }

    public Tree.Node getRight() {
        return right;
    }

    public void setLeft(Tree.Node left) {
        this.left = left;
    }

    public void setRight(Tree.Node right) {
        this.right = right;
    }

    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        Tree.Node otherNode  = (Tree.Node)other;
        return value == otherNode.getValue();
    }
}
