package com.DSA.tree.gfg;

import java.util.HashSet;

public class countNodesAtDistanceK {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.right = new Node(60);
        int k = 2;

        System.out.println(countNodes(root,k));
    }

    static HashSet<Integer> h = new HashSet<Integer>();
    public static int countNodes(Node root, int k){

        if (root == null){
            return -1;
        }
        if (k==0){
            h.add(root.key);
        } else {
            countNodes(root.left, k-1);
            countNodes(root.right, k-1);
        }
        return h.size();
    }
}
