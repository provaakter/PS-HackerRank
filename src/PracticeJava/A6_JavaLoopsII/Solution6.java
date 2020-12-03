package PracticeJava.A6_JavaLoopsII;

import java.util.*;

class Solution6 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int power = 1;
            for(int j = 0; j < n; j++){
                a = a + power * b;
                System.out.print(a + " ");
                power += power;
            }
            System.out.println();
        }
        in.close();
    }
}