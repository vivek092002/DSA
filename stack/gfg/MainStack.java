package com.DSA.stack.gfg;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());

        System.out.println(st.size());

        st.push(40);
        System.out.println(st.peek());

        System.out.println(st.isEmpty());
    }
}
