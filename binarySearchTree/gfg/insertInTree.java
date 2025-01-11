package com.DSA.binarySearchTree.gfg;

public class insertInTree {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);

        int x = 100;
        System.out.println(insert(root,x));
    }

    //recursive
    public static Node insert(Node root, int x){
        if (root == null){
            return new Node(x);
        }
        if (root.key > x){
            root.left = insert(root.left , x);
        } else if (root.key < x){
            root.right = insert(root.right, x);
        }
        return root;
    }
}
