//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package com.DSA.linkedList.leetcode;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        int n = 3;
        head = removeNthFromEnd(head, n);
        rPrint(head);
    }

    public static Node removeNthFromEnd(Node head, int n){
        int len = length(head);
        Node curr = head;
        int traverse = len - n - 1;
        for (int i = 0; i < traverse; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    private static int length(Node head){
        Node curr = head;
        int len  = 0;
        if (head==null){
            return len;
        }
        while (curr != null){
            curr = curr.next;
            len++;
        }
        //System.out.println(len);
        return len;
    }

    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print("->" + head.data);
        rPrint(head.next);
    }
}
