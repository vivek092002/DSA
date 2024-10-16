package com.DSA.linkedList.circularLinkedList;

public class deleteHeadNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head;

        head = DeleteNode(head);
        print(head);

    }

    public static Node DeleteNode(Node head){
        if (head == null){
            return null;
        }
        if (head.next == null){
            return null;
        }
        Node curr = head;
        while (curr.next != head){
            curr = curr.next;
        }

        curr.next = head.next;
        return curr.next;
    }


    //printing the elements of the array
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
