package com.DSA.linkedList.practice;

public class reverseKGroups {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k = 3;
        head = reverse(head,k);
        rPrint(head);
    }

    public static Node reverse(Node head, int k)
    {
        if(head == null)
            return null;
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
		/* next is now a pointer to (k+1)th node
		Recursively call for the list starting from
		current. And make rest of the list as next of
		first node */
        if (next != null)
            head.next = reverse(next, k);
        return prev;
    }
    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print("->" + head.data);
        rPrint(head.next);
    }
}
