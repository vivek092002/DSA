package com.DSA.tree.gfg;

public class maximumInABinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.right = new Node(70);

        System.out.println(maxElement(root));
    }

    public static int maxElement(Node root){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        else {
            return Math.max(root.key , Math.max(maxElement(root.left),maxElement(root.right)));
        }
    }
}
