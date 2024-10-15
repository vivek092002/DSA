package com.DSA.linkedList.leetcode;

public class binaryToInteger {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);

        int temp = getDecimalValue(head);
        System.out.println(temp);
    }

    public static int getDecimalValue(Node head) {
        Node curr = head;
        int count = 0;
        while (curr.next != null){
            count++;
            curr = curr.next;
        }

        double value = 0;
        while (head != null){
            value = value + head.data*Math.pow(2,count);
            count--;
            head = head.next;
        }

        return (int)value;
    }
}
