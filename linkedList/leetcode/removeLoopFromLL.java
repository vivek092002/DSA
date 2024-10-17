package com.DSA.linkedList.leetcode;

public class removeLoopFromLL {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = fourth;

        first = detectLoop(first);
        rPrint(first);

    }

    public static Node detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        if (slow!=fast){
            return head;
        }
        slow = head;
        while (slow.next!= fast.next){
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;

        return head;
    }

    public static void rPrint(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        rPrint(head.next);
    }
}
