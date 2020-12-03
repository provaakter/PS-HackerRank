package ThirtyDaysOfCode_Java.A3_IntrotoConditionalStatements;

import java.util.*;

public class Solution3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N>0){
            if(N % 2 != 0){
                System.out.print("Weird");
            }
            else{
                if((N >= 2 && N <= 5) || (N > 20)){
                    System.out.print("Not Weird");
                }
                else if(N >= 6 && N <= 20){
                    System.out.print("Weird");
                }
                else{
                    System.out.print("Not Weird");
                }                
            }
        }
        scanner.close();
    }
}