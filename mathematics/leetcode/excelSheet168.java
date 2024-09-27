package com.DSA.mathematics.leetcode;
//https://leetcode.com/problems/excel-sheet-column-title/

public class excelSheet168 {
    public static void main(String[] args) {
        int n  = 701;
        System.out.println(convertToTitle(n));
    }
    public static String convertToTitle(int columnNumber) {

        StringBuilder str = new StringBuilder();
        while(columnNumber > 0){
            int index = (columnNumber - 1) % 26;
            str.insert(0,(char)(index + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }
        return str.toString();
    }
}
