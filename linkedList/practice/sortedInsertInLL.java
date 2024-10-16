package com.DSA.linkedList.practice;

public class sortedInsertInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        int data = 4;
        head = insert(head, data);
        rPrint(head);
    }

    public static Node insert(Node head, int data){
        Node temp = new Node(data);
        //corner cases
        if (head == null){
            return null;
        }
        if (data < head.data){
            temp.next = head;
            return temp;
        }
        //any other possibility
        Node curr = head;
        while (curr.next != null && curr.next.data < data){
            curr = curr.next;
        }
        //changing the link
        temp.next = curr.next;
        curr.next = temp;

        return head;
    }

    //printing elements
    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print("->" + head.data);
        rPrint(head.next);
    }
}
