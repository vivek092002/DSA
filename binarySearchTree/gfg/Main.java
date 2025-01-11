package com.DSA.binarySearchTree.gfg;

//class node for BST
class Node{
    int key;
    Node right;
    Node left;
    public Node(int key){
        this.key = key;
    }
}
public class Main {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);
    }
}
