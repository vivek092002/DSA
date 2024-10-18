package com.DSA.stack.gfg;

//class for stack implementation
class MyStack{
    int arr[];
    int cap;
    int top;

    public MyStack(int cap) {
        top = -1;
        this.cap = cap;
        arr = new int[cap];
    }

    //function for push
    public  void push(int x){
        top++;
        arr[top] = x;
    }
    //function for pop
    public int pop(){
        int res = arr[top];
        top--;
        return res;
    }
    //function for return size
    public int size(){
        return top+1;
    }
    //function for stack is empty or not
    public boolean isEmpty(){
        return (top==-1);
    }
}

public class TestMainStack {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
    }
}
