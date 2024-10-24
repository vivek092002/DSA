package com.DSA.tree.gfg;

public class InOrderTraversal {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        System.out.println("InOrder Traversal : ");
        InOrder(tree);
    }

    public static void InOrder(Node node){
        if (node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.key + " ");
        InOrder(node.right);
    }

}
