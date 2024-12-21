package com.DSA.tree.gfg;

public class binaryTreeToDLL {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.right = new Node(70);


    }
    public Node prev = null;
    public static Node BTtoDLL(Node root){
        if (root == null){
            return root;
        }
        Node head = BTtoDLL(root.left);
        return head;
    }
}
