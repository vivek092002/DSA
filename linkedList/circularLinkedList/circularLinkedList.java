package com.DSA.linkedList.circularLinkedList;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class circularLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head;

        print(head);
    }

    public static void print(Node head){
        Node curr = head;
        if (head!=null){
            do {
                System.out.print(curr.data + "->");
                curr = curr.next;
            } while (curr != head);
        }
        System.out.println("HEAD");
    }

}
