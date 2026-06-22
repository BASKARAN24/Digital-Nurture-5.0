import java.util.Scanner;

class FinancialForecasting {

    public static double forecast(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + growthRate / 100);
        return forecast(nextValue, growthRate, years - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter current value: ");
        double currentValue = scan.nextDouble();
        System.out.print("Enter annual growth rate (%): ");
        double growthRate = scan.nextDouble();
        System.out.print("Enter number of years: ");
        int years = scan.nextInt();
        double futureValue = forecast(currentValue, growthRate, years);
        System.out.printf("\nPredicted Future Value after %d years = %.2f\n",
                years, futureValue);
    }
}