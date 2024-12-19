package com.DSA.tree.gfg;

public class childrenSumProperty {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.right = new Node(70);

        System.out.println(isChildSum(root));

    }

    public static boolean isChildSum(Node root){
        if (root == null){
            return true;
        }
        if (root.left == null && root.right==null){
            return true;
        }
        int sum = 0;
        if (root.left != null){
            sum += root.left.key;
        }
        if (root.right != null){
            sum += root.right.key;
        }
        return (root.key == sum && isChildSum(root.left) && isChildSum(root.right));
    }
}
