package ThirtyDaysOfCode_Java.B11_2DArrays;

import java.util.*;

public class Solution11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        int sum = 0;
        int max = -9*7; //as every value range of array is -9 to 9
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = scan.nextInt();                
            }
        }

        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr.length-2;j++){
                sum = arr[i][j] + 
                          arr[i][j+1] + 
                          arr[i][j+2] + 
                          arr[i+1][j+1] + 
                          arr[i+2][j] + 
                          arr[i+2][j+1] + 
                          arr[i+2][j+2];
                if(max<sum){
                    max = sum;
                } 
            }
        }

        System.out.println(max);
        scan.close();
    }
}