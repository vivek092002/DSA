//https://leetcode.com/problems/maximum-depth-of-binary-tree/
package com.DSA.tree.leetcode;


public class maxDepthOfTree {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.right.left = new Node(4);
        tree.right.right = new Node(5);

        System.out.println(maxDepth(tree));
    }

    public static int maxDepth(Node root){
        if (root == null){
            return 0;
        } else {
            return Math.max((maxDepth(root.left)),(maxDepth(root.right))+1);
        }
    }
}
