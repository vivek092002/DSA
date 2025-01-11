package com.DSA.binarySearchTree.gfg;

public class searchInTree {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);

        int x = 16;
        System.out.println(search(root,x));
        System.out.println(search2(root,x));
    }
    //recursive way
    public static boolean search(Node root, int x){
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
    public static boolean search2(Node root, int x){
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
