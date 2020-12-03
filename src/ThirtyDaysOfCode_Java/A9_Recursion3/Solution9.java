package ThirtyDaysOfCode_Java.A9_Recursion3;

import java.util.*;

public class Solution9 {

    static int factorial(int n) {
        if(n==1 || n==0){
             return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int result = factorial(n);
        
        System.out.println(result);

        scan.close();
    }
}