# Trees
Trees can be traversed using two catogories of tranversal methods
1)depth first: has to be stack and it has three methods
     1.1 preorder
     1.2 inorder
     1.3 postorder
2)breadth first: it starts at the root and level by level visits all nodes

## Challenge
Declaring class node and binary search tree and writing a method
for traversing a tree with depth first approach like preorder, inorder, postorder
Write a method named add that adds a new node in the correct location in the binary search tree.
Write a method named search that brings in a value of node, and returns the node with the desired value.

## Approach & Efficiency
The run time of depth first or BIG O O(n) time and space

## API
     1.1 preorder: go and check root first
     1.1 inorder: first check left.next right next root(ascending order)
     1.1 postorder: visit other nodes and at last visit root