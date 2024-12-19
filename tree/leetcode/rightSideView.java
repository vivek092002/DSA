//https://leetcode.com/problems/binary-tree-right-side-view/description/
package com.DSA.tree.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rightSideView {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.right = new Node(70);

        System.out.println(Arrays.toString(new List[]{rightSideView(root)}));
    }
    public static List<Integer> rightSideView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        int level = 0;
        rightView(root, list, 0);
        return list;
    }

    public static void rightView(Node root, ArrayList<Integer> result, int level){
        if (root == null){
            return;
        }
        if (level == result.size()){
            result.add(root.key);
        }
        rightView(root.right, result, level+1);
        rightView(root.left, result, level+1);
    }

}
