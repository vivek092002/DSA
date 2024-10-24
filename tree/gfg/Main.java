package com.DSA.tree.gfg;

class Node{
    int key;
    Node left;
    Node right;

    //constructor
    public Node(int key) {
        this.key = key;
    }
}

public class Main {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
    }
}
