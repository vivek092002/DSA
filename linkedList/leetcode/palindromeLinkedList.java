//https://leetcode.com/problems/palindrome-linked-list/description/
package com.DSA.linkedList.leetcode;

import java.util.Stack;

public class palindromeLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println(Palindrome(head));
    }

    //Naive Method
    public static boolean Palindrome(Node head){
        Stack<Integer> st = new Stack<Integer>();
        for (Node curr = head; curr!=null ; curr = curr.next){
            st.push(curr.data);
        }
        for (Node curr = head; curr!=null ; curr = curr.next){
            if (st.pop() != curr.data){
                return false;
            }
        }
        return true;
    }

    //

}
