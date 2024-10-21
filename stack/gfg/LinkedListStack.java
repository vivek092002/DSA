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

    public void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    public int pop(){
        if (head==null){
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    public int peek(){
        if (head==null){
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

}

public class LinkedListStack {
    public static void main(String[] args) {

    }
}
