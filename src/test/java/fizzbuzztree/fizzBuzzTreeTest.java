package fizzbuzztree;
import org.junit.Test;
import static org.junit.Assert.*;
import Tree.BinaryTree;
import Tree.Node;
import org.junit.Test;

public class fizzBuzzTreeTest {
    public static void main(String[] args) {
        fizzBuzzTreeTest.fizzBuzzTreeTest();
    }

    @Test
 public static  void fizzBuzzTreeTest() {

        Node<Object> myTestTree = new Node<Object>(15);


        Node<Object> left = new Node<Object>(3);
        myTestTree.setLeft(left);
        Node<Object> right = new Node<Object>(5);
        myTestTree.setRight(right);

     FizzBuzzTree.fizzbuzztree(myTestTree);

        assertTrue( myTestTree.getValue() == "fizzbuzz");
        assertTrue( myTestTree.getLeft().getValue() == "Fizz");
        assertTrue( myTestTree.getRight().getValue() == "Buzz");

        //assertEqual(fuzzd);
 }

 }
