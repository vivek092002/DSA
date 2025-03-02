package numbers;

import java.util.*;

public class palindromeNumber{

    public static boolean isPalin(int num){
        int dup = num;
        int rev = 0;
        while (num > 0 ) {
            int temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
        }

        if (rev == dup) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalin(n));
        sc.close();
    }
}