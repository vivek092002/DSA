package com.DSA.queue.gfg;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedListQueue {
    Node front, rear;
    int size = 0;
    public LinkedListQueue() {
        front = rear = null;
        size = 0;
    }

    void enqueue(int x){
        Node temp = new Node(x);
        if (front == null){
            front = rear = temp;
            return;
        }
        rear.next = rear;
        rear = temp;
    }
    void dequeue(){
        if (front==null){
            return;
        }
        size--;
        front = front.next;
        if (front==null){
            rear = null;
        }
    }
}
