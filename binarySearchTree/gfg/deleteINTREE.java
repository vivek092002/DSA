//https://leetcode.com/problems/delete-node-in-a-bst/description/
package com.DSA.binarySearchTree.gfg;

public class deleteINTREE {
    public static void main(String[] args) {
        node root = new node(15);
        root.left = new node(5);
        root.right = new node(20);
        root.left.left = new node(3);
        root.right.left = new node(18);
        root.right.right = new node(80);
        root.right.left.left = new node(16);

        int x = 15;
        System.out.println(delNode(root,x));

    }

    public static node delNode(node root, int x){
        if (root==null){
            return null;
        } else if (root.key > x){
            root.left = delNode(root,x);
        } else if (root.key < x){
            root.right = delNode(root,x);
        } else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            } else {
                node succ = getsucc(root);
                root.key = succ.key;
                root.right = delNode(root.right, succ.key);
            }

        }
        //return null;
        return root;
    }

    private static node getsucc(node root){
        node curr = root.right;
        while (curr!=null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}
