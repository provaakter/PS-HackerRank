package ThirtyDaysOfCode_Java.A5_Loops;

import java.util.*;

public class Solution5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        }
        scanner.close();
    }
}
