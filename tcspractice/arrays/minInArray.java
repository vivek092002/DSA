package arrays;

import java.util.Scanner;

public class minInArray {

    public static int findMin(int[] arr, int n){
        int min = arr[0];
        for (int i = 0; i < n ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr,n));
        sc.close();
    }
}
