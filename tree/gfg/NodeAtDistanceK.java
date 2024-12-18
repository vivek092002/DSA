package com.DSA.tree.gfg;

public class NodeAtDistanceK {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.right = new Node(60);
        int k = 2;

        printKDistance(root,k);
    }
    public static void printKDistance(Node root, int k){
        if (root == null){
            return;
        }
        if (k==0){
            System.out.print(root.key + " ");
        } else {
            printKDistance(root.left, k-1);
            printKDistance(root.right, k-1);
        }
    }
}
