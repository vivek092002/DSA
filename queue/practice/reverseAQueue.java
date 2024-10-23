package com.DSA.queue.practice;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverseAQueue {
    public static void main(String[] args) {
        Queue<Integer> qu = new ArrayDeque<>();
        qu.offer(10);
        qu.offer(20);
        qu.offer(30);
        qu.offer(40);
        qu.offer(50);

        reverse(qu);
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> st = new Stack<>();
        while (!queue.isEmpty()){
            st.push(queue.remove());
        }
        while (!st.isEmpty()){
            queue.offer(st.pop());
        }

        System.out.println(queue);
    }
}
