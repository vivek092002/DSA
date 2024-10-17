//https://leetcode.com/problems/swap-nodes-in-pairs/
package com.DSA.linkedList.leetcode;

public class pairwiseSwapData {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = swapData(head);
        rPrint(head);
    }

    //Naive Method
    public static Node swapData(Node head){
        Node curr = head;
        while (curr!=null && curr.next!=null){
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }

        return head;
    }
    public static void rPrint(Node head){
        if (head == null){
            System.out.print("null");
            return;
        }
        System.out.print(head.data + "->");
        rPrint(head.next);
    }
}
