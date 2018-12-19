package Tree;

  public class Node<T> {

      public T value;
      private Node left;
      private Node right;

      public Node(T value) {
          this(value, null, null);
      }

      public Node(T value, Node left, Node right) {
          this.value = value;
          this.left = left;
          this.right = right;
      }

      public T getValue() {
          return value;
      }

      public Node getLeft() {
          return left;
      }

      public Node getRight() {
          return right;
      }

      public void setLeft(Node<Object> left) {
          this.left = left;
      }

      public void setRight(Node<Object> right) {
          this.right = right;
      }
  }







