package com.DSA.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class generateNumberWithDigits {
    public static void main(String[] args) {
        printFirstN(10);
    }

    public static void printFirstN(int n){
        Queue<String> q = new LinkedList<>();
        q.offer("5");
        q.offer("6");

        for (int i = 0; i < n; i++) {
            String curr = q.peek();
            System.out.print(curr + " ");
            q.remove();
            q.offer(curr + "5");
            q.offer(curr + "6");
        }
    }
}
