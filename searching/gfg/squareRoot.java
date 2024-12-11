package com.DSA.searching.gfg;

public class squareRoot {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(sqrRoot(x));
    }

    public static int sqrRoot(int x){
        int low = 1, high = x;
        int ans = -1;
        while (low <= high){
            int mid = (low+high)/2;
            int msq = mid*mid;
            if (msq == x){
                return mid;
            } else if (msq > x){
                high = mid -1;
            } else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
