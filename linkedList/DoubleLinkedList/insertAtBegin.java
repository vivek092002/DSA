package com.DSA.linkedList.DoubleLinkedList;


public class insertAtBegin {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head = insert(head);
        rPrint(head);


    }

    public static Node insert(Node head){
        Node temp = new Node(5);
        temp.next = head;
        if (head!=null){
            head.prev = temp;
        }

        return temp;
    }

    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        rPrint(head.next);
    }
}
