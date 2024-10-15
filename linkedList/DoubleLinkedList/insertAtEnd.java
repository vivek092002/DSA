package com.DSA.linkedList.DoubleLinkedList;

public class insertAtEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        int data = 40;
        head = insert(head,data);
        rPrint(head);
    }

    //insert at end
    private static Node insert(Node head, int data){
        Node temp = new Node(data);
        if (head == null){
            return temp;
        }

        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    private static void rPrint(Node head ){
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        rPrint(head.next);
    }
}
