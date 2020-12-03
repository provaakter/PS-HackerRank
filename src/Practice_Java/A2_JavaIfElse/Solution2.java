package Practice_Java.A2_JavaIfElse;

import java.util.*;

public class Solution2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if(n%2!=0){
                System.out.println("Weird");
            }
        else{
                if(n>1 && n<6){
                    System.out.println("Not Weird");
                }
                if(n>5 && n<21){
                    System.out.println("Weird");
                }
                if(n>20){
                    System.out.println("Not Weird");
                }
         }
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }
}
