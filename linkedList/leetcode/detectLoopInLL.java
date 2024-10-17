//https://leetcode.com/problems/linked-list-cycle/description/

package com.DSA.linkedList.leetcode;

import java.util.HashSet;

public class detectLoopInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(loop(head));
        System.out.println(hasCycle(head));
    }

    //Naive Solution
    public static boolean loop(Node head){
        HashSet<Node> st = new HashSet<Node>();
        while (head != null){
            //checking if element is already there or not
            if (st.contains(head)){
                return true;
            }

            st.add(head);
            head = head.next;
        }

        return false;
    }

    //optimised solution
    public static boolean hasCycle(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
}
