//https://leetcode.com/problems/intersection-of-two-linked-lists/description/
package com.DSA.linkedList.leetcode;

import java.util.HashSet;

public class interSectionOfLl {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        System.out.println(intersection(head,head2));
    }

    public static int intersection(Node head, Node head2){
        HashSet<Integer> h = new HashSet<Integer>();
        //putting all elements in the array
        Node curr = head;
        while (curr!=null){
            h.add(curr.data);
            curr = curr.next;
        }
        curr = head2;
        while (curr != null){
            if (h.contains(curr.data)){
                return curr.data;
            }

            h.add(curr.data);
        }
        return -1;
    }

    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        rPrint(head.next);
    }
}
