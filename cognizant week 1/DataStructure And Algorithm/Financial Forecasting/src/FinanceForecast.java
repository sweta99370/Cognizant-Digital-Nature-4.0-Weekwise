import java.util.Scanner;

public class FinanceForecast {

    // Iterative function to calculate future value
    public static double futureValueIterative(double principal, double rate, int years) {
        double result = principal;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.08 for 8%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Forecast calculation
        double forecast = futureValueIterative(principal, rate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, forecast);

        scanner.close();
    }
}
