package com.DSA.tree.gfg;


import java.util.ArrayList;

public class PreOrderTraversal {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        System.out.println("Pre Order Traversal : ");
        System.out.println(PreOrder(tree).toString());

    }
    public static ArrayList<Integer> PreOrder(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(node.key);
        if(node.left != null){
            list.addAll(PreOrder(node.left));
        }
        if(node.right != null){
            list.addAll(PreOrder(node.right));
        }

        return list;
    }
}
