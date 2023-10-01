import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = findLargestElement(arr);

        System.out.println("The largest element in the array is: " + largest);

        scanner.close();
    }

    public static int findLargestElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int largest = arr[0]; // Initialize with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
