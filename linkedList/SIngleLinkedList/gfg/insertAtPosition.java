package com.DSA.linkedList.SIngleLinkedList.gfg;

public class insertAtPosition {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        int pos = 3;
        int data = 4;
        Node temp = insetAfter(data,pos,head);
        rPrint(head);
    }

    public static Node insetAfter(int data, int pos, Node head){

        Node new_data = new Node(data);
        if (pos==1){
            new_data.next = head;
            return new_data;
        }
        Node curr = head;
        for (int i = 1; i < pos ; i++) {
            curr = curr.next;
        }

        if (curr.next == null){
            return head;
        }

        new_data.next = curr.next;
        curr.next = new_data;

        return head;
    }

    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.println(head.data + " ");
        rPrint(head.next);
    }
}
