package ThirtyDaysOfCode_Java.B10_BinaryNumbers;

import java.util.*;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0, max = 0;

        while(n != 0){
            if(n%2==1){
                count++;
                if(count>=max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
            n = n/2;
        }
        
        System.out.println(max);
        scanner.close();
    }
}