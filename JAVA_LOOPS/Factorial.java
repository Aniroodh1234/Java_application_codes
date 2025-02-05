import java.util.Scanner;

public class Factorial{
    public static void main(String[]args){
        System.out.print("enter a number to calculate the factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial *= i;
        }
        System.out.print("the factorial of " + n + " is "+factorial);
    }
}