import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input_number = sc.nextInt();        
        sc.nextLine();

        for(int i=0; i<input_number; i++){
                        
            String input = sc.nextLine();

            for(int j=0; j<input.length(); j++){
                if(j%2==0){
                    System.out.print(input.charAt(j));
                }                
            }
            System.out.print(" ");

            for(int j=0; j<input.length(); j++){
                if(j%2!=0){
                    System.out.print(input.charAt(j));
                }                
            }
            System.out.println();
        }
    }
}