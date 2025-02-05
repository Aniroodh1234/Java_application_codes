import java.util.Scanner;
public class MaxProduct {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();
            int[] array = new int[n];
            System.out.println("Enter " + n + " positive integers:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                if (array[i] <= 0) {
                    System.out.println("All elements must be positive integers.");
                    return;
                }
            }
            int max1 = Integer.MIN_VALUE; 
            int max2 = Integer.MIN_VALUE; 

            for (int num : array) {
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }
            }

            int maxProduct = max1 * max2;

            System.out.println("highest number in array are: " + max1 + " and " + max2);
            System.out.println("Maximum product is: " + maxProduct);
        }
    }
}
