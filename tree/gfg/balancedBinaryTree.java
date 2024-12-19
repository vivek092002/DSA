package com.DSA.tree.gfg;

public class balancedBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.right = new Node(70);

        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(Node root){
        return dfsHeight(root)  != -1;
    }

    private static int dfsHeight(Node root){
        if (root == null){
            return -1;
        }
        int lh = dfsHeight(root.left);
        if (lh == -1){
            return -1;
        }
        int rh = dfsHeight(root.right);
        if (rh == -1){
            return -1;
        }
        // check rh and lh
        if (Math.abs(lh - rh)>1){
            return -1;
        } else {
            return Math.max(lh,rh)+1;
        }
    }
}
