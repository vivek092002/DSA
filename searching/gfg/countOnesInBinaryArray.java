//Given a binary sorted non-increasing array of 1s and 0s.
//You need to print the count of 1s in the binary array.
//
//Example 1:
//
//Input:
//N = 8
//arr[] = {1,1,1,1,1,0,0,0}
//Output: 5
//Explanation: Number of 1's in given
//binary array : 1 1 1 1 1 0 0 0 is 5.

package com.DSA.searching.gfg;

public class countOnesInBinaryArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,0,0,0};
        int N = arr.length;
        System.out.println(countOnes(arr,N));
    }

    static int countOnes(int arr[], int n)
    {
        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == 0)
                low = mid + 1;
            else
            {
                if(mid == 0 || arr[mid - 1] == 0)
                    return (n - mid);
                else
                    high = mid -1;
            }
        }

        return 0;
    }
}
