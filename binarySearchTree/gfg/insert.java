package com.DSA.binarySearchTree.gfg;

public class insert {
    public static void main(String[] args) {
        node root = new node(15);
        root.left = new node(5);
        root.right = new node(20);
        root.left.left = new node(3);
        root.right.left = new node(18);
        root.right.right = new node(80);
        root.right.left.left = new node(16);

        int x = 100;
        System.out.println(insert(root,x));
    }

    //recursive
    public static node insert(node root, int x){
        if (root == null){
            return new node(x);
        }
        if (root.key > x){
            root.left = insert(root.left , x);
        } else if (root.key < x){
            root.right = insert(root.right, x);
        }
        return root;
    }
}
