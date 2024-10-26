package com.DSA.tree.gfg;

public class heightOfTree {
    public static void main(String[] args) {

        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        System.out.println(Height(tree));
    }
    public static int Height(Node root){
        if (root == null){
            return 0;
        }
        else {
            return Math.max((Height(root.left)),Height(root.right))+1;
        }
    }
}
