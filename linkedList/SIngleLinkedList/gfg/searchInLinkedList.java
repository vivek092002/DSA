package com.DSA.linkedList.SIngleLinkedList.gfg;

public class searchInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int x = 4;
        int temp = search(head,x);
        System.out.println(temp);

    }
    public static int search(Node head, int x){
        int pos = 1;
        Node curr = head;
        while (curr.next != null){
            if (curr.data == x){
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }

        return -1;
    }
}
