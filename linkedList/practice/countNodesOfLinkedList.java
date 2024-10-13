package com.DSA.linkedList.practice;

//class for node
class Node{
    int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class countNodesOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(getCount(head));

    }

    public static int getCount(Node head){
        int count = 0;
        Node curr = head;
        while (curr != null){
            count++;
            curr = curr.next;
        }

        return count;
    }
}
