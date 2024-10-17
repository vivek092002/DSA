package com.DSA.linkedList.practice;

import java.util.ArrayList;

public class reverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = revList(head);
        rPrint(head);
    }

    //first way
    public static Node revList(Node head){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node curr = head;
        while (curr != null){
            list.add(curr.data);
            curr = curr.next;
        }

        for (Node curr2 = head; curr2!=null ; curr2 = curr2.next){
            curr2.data = list.remove(list.size()-1);
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
