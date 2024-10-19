package com.DSA.stack.gfg;

//linked list implementation
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

//defining stack
class MyStackLL{
    Node head;
    int size;

    //constructor declare
    public MyStackLL(Node head) {
        this.head = head;
        int size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return (head==null);
    }

}

public class LinkedListStack {
    public static void main(String[] args) {

    }
}
