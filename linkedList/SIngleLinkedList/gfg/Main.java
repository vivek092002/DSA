package com.DSA.linkedList.SIngleLinkedList.gfg;

class Node{
    int data;
    Node next;
    //constructor of the Node
    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;
    }
}