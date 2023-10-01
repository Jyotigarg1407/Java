import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();

        int reversed = reverseNumber(num);

        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }

    public static int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        return reversed;
    }
}
