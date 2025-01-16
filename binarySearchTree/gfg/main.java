package com.DSA.binarySearchTree.gfg;

//class node for BST
class node {
    int key;
    node right;
    node left;
    public node(int key){
        this.key = key;
    }
}
public class main {
    public static void main(String[] args) {
        node root = new node(15);
        root.left = new node(5);
        root.right = new node(20);
        root.left.left = new node(3);
        root.right.left = new node(18);
        root.right.right = new node(80);
        root.right.left.left = new node(16);
    }
}
