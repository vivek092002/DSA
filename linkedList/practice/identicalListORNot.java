package com.DSA.linkedList.practice;

public class identicalListORNot {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(6);

        System.out.println(areIdentical(head, head2));

    }

    public static boolean areIdentical(Node head1, Node head2) {
        int len = length(head1);
        int len2 = length(head2);
        if (len!=len2){
            return false;
        }
        while (head1.next != null  && head2.next != null){
            if (head1.data == head2.data){
                head1 = head1.next;
                head2 = head2.next;
            } else {
                return false;
            }
        }
        return true;
    }

    private static int length(Node head){
        Node curr = head;
        int count = 0;
        while (curr.next != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
}
