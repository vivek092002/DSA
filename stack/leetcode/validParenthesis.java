package com.DSA.stack.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class validParenthesis {
    public static void main(String[] args) {
        String str = "{{{{()[][][]}}}}";
        System.out.println(isBalanced(str));
    }
    
    public static boolean isBalanced(String str){
        Deque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ( c == '(' || c == '{' || c == '['){
                s.push(c);
                continue;
            }
            if (s.isEmpty()){
                return false;
            }

            char check;
            switch (c){
                case ')':
                    check = s.pop();
                    if (check == '{' || check == '['){
                        return false;
                    }break;
                case '}':
                    check = s.pop();
                    if (check == '(' || check == '['){
                        return false;
                    } break;
                case ']':
                    check = s.pop();
                    if (check == '{' || check == '('){
                        return false;
                    } break;
            }
        }
        return (s.isEmpty());
    }
}
