package fizzbuzztree;

import Tree.BinarySearchTree;
import Tree.BinaryTree;
import Tree.Node;

public class FizzBuzzTree {

    public static Node<Object> fizzBuzzTree(Node<Object> t){
         return fizzbuzztree(t);
        //return t;
    }
    public static Node<Object>   fizzbuzztree(Node<Object> root ){
        if (root == null) {
            return null;
        }
        if(root.getLeft() != null){
         fizzbuzztree(root.getLeft());
        }
        if(root.getRight() !=null){
            fizzbuzztree(root.getRight());
        }

        if((int) root.getValue() % 3 == 0 && (int) root.getValue()%5 == 0){
            root.value = "fizzbuzz";

        }
        else if((int)root.getValue()%3 ==0) {root.value = "Fizz";}

        else if((int) root.getValue() % 5 ==0){
            root.value = "Buzz";
        }
            return root;

    }

    }


