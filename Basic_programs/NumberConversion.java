import java.util.Scanner;

public class NumberConversion {

    // Function to convert a number to binary representation
    public static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        
        // Edge case: if the number is 0
        if (num == 0) {
            return "0";
        }
        
        while (num > 0) {
            binary.insert(0, num % 2);
            num = num / 2; 
        }
        
        return binary.toString();
    }

    public static String toHexadecimal(int num) {
        StringBuilder hex = new StringBuilder();
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        if (num == 0) {
            return "0";
        }

        while (num > 0) {
            hex.insert(0, hexDigits[num % 16]); 
            num = num / 16; 
        }

        return hex.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
    
        System.out.println("Binary representation: " + toBinary(num));
        System.out.println("Hexadecimal representation: " + toHexadecimal(num));
        
        scanner.close();
    }
}
