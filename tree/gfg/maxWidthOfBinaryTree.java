package com.DSA.tree.gfg;

import java.util.LinkedList;
import java.util.Queue;

public class maxWidthOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.right = new Node(70);

        System.out.println(maxWidth(root));
    }

    //O(N^2)
    public static int maxWidth(Node root){
        if (root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while (q.isEmpty() == false){
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return res;
    }
}
