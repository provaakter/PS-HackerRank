import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scan.nextInt();
            arr[i] = arrItem;
        }

        for(int i = n-1; i >= 0; i--){
            System.out.printf("%d ", arr[i]);
        }

        scan.close();
    }
}