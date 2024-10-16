package com.DSA.linkedList.circularLinkedList;

public class insertAtEndLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head;

        System.out.println("After Insertion");
        int data = 5;
        head = insertAtEnd(head,data);
        print(head);
    }

    public static Node insertAtEnd(Node head, int data){
        return head;
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
