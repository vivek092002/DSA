package com.DSA.linkedList.gfg;

public class printingElementsOfLL {
    public static void main(String[] args) {
        Node head = new Node(30);

        //System.out.println(head.data);
        print(head);
        rPrint(head);
    }

    //printing elements of the linked list
    public static void print(Node head){
        Node curr = head;
        while (curr!= null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.println(head.data + " ");
        rPrint(head.next);
    }
}
