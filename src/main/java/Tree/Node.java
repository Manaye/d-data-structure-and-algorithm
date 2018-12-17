package Tree;

  public class Node {

    private int value;
    private Node left;
    private Node right;

    public Node (int value) {
        this(value, null, null);
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        Node otherNode  = (Node)other;
        return value == otherNode.getValue();
    }
}
