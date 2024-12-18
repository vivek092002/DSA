package com.DSA.tree.gfg;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.right = new Node(70);

        printOrder(root);
    }

    public static void printOrder(Node root){
        if (root==null){
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.isEmpty() == false){
            Node curr = q.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null){
                q.add(curr.left);
            }
            if (curr.left != null){
                q.add(curr.right);
            }
        }
    }
}
