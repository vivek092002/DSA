package com.DSA.binarySearchTree.gfg;

public class Search {
    public static void main(String[] args) {
        node root = new node(15);
        root.left = new node(5);
        root.right = new node(20);
        root.left.left = new node(3);
        root.right.left = new node(18);
        root.right.right = new node(80);
        root.right.left.left = new node(16);

        int x = 16;
        System.out.println(search(root,x));
        System.out.println(search2(root,x));
    }
    //recursive way
    public static boolean search(node root, int x){
        if (root == null){
            return false;
        }
        if (root.key == x){
            return true;
        } else if(root.key > x){
            return search(root.left,x);
        } else {
            return search(root.right, x);
        }
    }

    //iterative way
    public static boolean search2(node root, int x){
        while (root!= null){
            if (root.key == x){
                return true;
            } else if (root.key < x){
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return false;
    }
}
