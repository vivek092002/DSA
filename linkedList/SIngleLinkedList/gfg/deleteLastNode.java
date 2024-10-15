package com.DSA.linkedList.SIngleLinkedList.gfg;

public class deleteLastNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Before Deletion");
        rPrint(head);
        System.out.println();
        head = deleteTail(head);
        System.out.println("After Deletion");
        rPrint(head);

    }

    public static Node deleteTail(Node head){

        if (head==null){
            return null;
        }
        if (head.next == null){
            return null;
        }
        Node curr = head;
        while (curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;
        return head;
    }

    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print("->" + head.data);
        rPrint(head.next);
    }
}
