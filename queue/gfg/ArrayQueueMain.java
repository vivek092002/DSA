package com.DSA.queue.gfg;

class Queue{
    int size, cap;
    int[] arr;

    //for capacity mentioned
    public Queue(int cap) {
        this.cap = cap;
        size = 0;
        arr = new int[cap];
    }
    //constructor for no cap
    public Queue(){
        cap = 0;
        size = 0;
        arr = new int[cap];
    }
    //check for queue is full
    public boolean isFull(){
        return (size==cap);
    }

    //check if queue is Empty
    public boolean isEmpty(){
        return (size==0);
    }

    //enQueue
    public void Enqueue(int x){
        if (isFull()){
            return;
        }
        arr[size] = x;
        size++;
    }

    //DeQueue
    public void Dequeue(){
        if (isEmpty()){
            return;
        }
        for (int i = 0; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    //get front
    public int getFront(){
        if (isEmpty()){
            return -1;
        } else {
            return 0;
        }
    }

    //get Rear
    public int getRear(){
        if (isEmpty()){
            return -1;
        } else {
            return size-1;
        }
    }

}

public class ArrayQueueMain {
    public static void main(String[] args) {
        Queue qu = new Queue(10);
        System.out.println(qu.isFull());
        System.out.println(qu.isEmpty());

        qu.Enqueue(10);
        qu.Enqueue(20);
        qu.Enqueue(30);
        qu.Enqueue(40);
        qu.Enqueue(50);

        qu.Dequeue();

        System.out.println(qu.getFront());
        System.out.println(qu.getRear());
    }
}
