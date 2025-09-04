package assignment14;

import java.util.Scanner;

public class PowerCalculator {
    public static double myPow(double x, int n) {
        if (n == 0)
            return 1.0;
        if (n < 0)
            return 1.0 / myPow(x, -n);
        double half = myPow(x, n / 2);
        if (n % 2 == 0)
            return half * half;
        else
            return x * half * half;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();

        double result = myPow(x, n);
        System.out.printf("Result: %.5f\n", result);

        scanner.close();
    }
}


