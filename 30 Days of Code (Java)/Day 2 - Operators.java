import java.io.;
import java.math.;
import java.security.;
import java.text.;
import java.util.;
import java.util.concurrent.;
import java.util.regex.;

public class Solution {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip_cost = meal_cost  tip_percent  100;
        double tax_cost = meal_cost  tax_percent  100;
        int total_cost = (int)Math.round(meal_cost + tip_cost + tax_cost);
        System.out.print(total_cost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
