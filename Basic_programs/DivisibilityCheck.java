import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int originalNumber = n; // Store the original number
        int sum = 0;

        // Calculate the sum of digits
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            sum += digit;
            n = n / 10; // Remove the last digit
        }

        // Check divisibility
        if (originalNumber % sum == 0) {
            System.out.println("Divisible by sum of its digits");
        } else {
            System.out.println("Not divisible by sum of its digits");
        }

    }
}

