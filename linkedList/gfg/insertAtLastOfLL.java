package com.DSA.linkedList.gfg;

public class insertAtLastOfLL {
    public static void main(String[] args) {
        Node head = null;
        head = insertEnd(head,1);
        head = insertEnd(head, 2);
        head = insertEnd(head,3);

        rPrint(head);
    }

    public static Node insertEnd(Node head,int data){
        Node temp = new Node(data);
        if (head== null){
            return temp;
        }

        //if not null
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
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
