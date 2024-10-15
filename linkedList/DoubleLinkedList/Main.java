package com.DSA.linkedList.DoubleLinkedList;

class Node{
    int data;
    Node prev;
    Node next;
    //doubly linked list
    public Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        rPrint(head);
    }
    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        rPrint(head.next);
    }
}
