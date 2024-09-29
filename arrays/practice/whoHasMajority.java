package com.DSA.arrays.practice;

public class whoHasMajority {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,4,4,5};
        int n = arr.length;
        int x = 4;
        int y = 5;
        System.out.println(majorityWins(arr,n,x,y));
    }

    public static int majorityWins(int[] arr, int n, int x, int y) {
        // code here
        int count = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x){
                count++;
            } else if (arr[i] == y){
                count2++;
            }
        }
        if (count == 0 && count2 ==0){
            return Math.min(x,y);
        }
        if (count == count2){
            return Math.min(x,y);
        } else if (count2>count){
            return y;
        } else {
            return x;
        }

    }
}
