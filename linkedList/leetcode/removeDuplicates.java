//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

//LL is Sorted
package com.DSA.linkedList.leetcode;

public class removeDuplicates {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);

        head = remove(head);
        rPrint(head);

    }

    public static Node remove(Node head){
        if (head == null){
            return null;
        }

        Node curr = head;
        while (curr.next != null){
            if (curr.data != curr.next.data){
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }

        return head;
    }

    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print("->" + head.data);
        rPrint(head.next);
    }
}
