package com.DSA.linkedList.SIngleLinkedList.gfg;

public class insertAtBeginning {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = Insert(6,head);
        rPrint(head);
    }

    public static Node Insert(int new_data, Node head){

        //creates new node;
        Node temp = new Node(new_data);

        //links the next of new node to the head
        temp.next = head;
        //move the head pointer to the new node
        //head = temp;
        return temp;
    }

    //printing the node of the linked list
    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.println(head.data + " ");
        rPrint(head.next);
    }
}
