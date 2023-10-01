import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            long factorial = calculateFactorialRecursive(num);
            System.out.println("Factorial of " + num + " is " + factorial);
        }

        scanner.close();
    }

    public static long calculateFactorialRecursive(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorialRecursive(num - 1);
        }
    }
}
