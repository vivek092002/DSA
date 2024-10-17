package com.DSA.linkedList.leetcode;

import java.util.Stack;

public class reverseLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("before");
        rPrint(head);
        System.out.println();
        System.out.println("after");
        head = reverse(head);
        rPrint(head);
    }

    //Naive Method O(2N)
    //we are using a stack to push the data into it...and then calling element stored in the top one by one
    //because they are stored in the reverse order
    public static Node reverse(Node head){
        Stack<Integer> st = new Stack<Integer>();
        Node temp = head;
        while (temp!=null){
            st.push(temp.data);
            temp = temp.next;
        }

        Node temp2 = head;
        while (temp2 != null){
            temp2.data = st.pop();
            temp2 = temp2.next;
        }

        return head;
    }



    //Printing the element
    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        rPrint(head.next);
    }

}
