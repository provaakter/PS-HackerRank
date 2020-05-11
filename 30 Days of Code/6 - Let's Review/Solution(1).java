import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input_number = sc.nextInt();        
        sc.nextLine();

        for(int i=0; i<input_number; i++){
                        
            String input = sc.nextLine();
            char c[] = input.toCharArray();

            for(int j=0; j<c.length; j++){
                if(j%2==0){
                    System.out.print(c[j]);
                }                
            }
            System.out.print(" ");

            for(int j=0; j<c.length; j++){
                if(j%2!=0){
                    System.out.print(c[j]);
                }                
            }
            System.out.println();
        }
    }
}