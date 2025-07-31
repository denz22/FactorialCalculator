import java.util.Scanner;

public class FactorialCalculator {

    // Iterative method
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method
    public static long factorialRecursive(int n) {
        if (n <= 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial (Iterative) of " + num + " is: " + factorialIterative(num));
            System.out.println("Factorial (Recursive) of " + num + " is: " + factorialRecursive(num));
        }

        scanner.close();
    }
}
