import java.util.Scanner;
public class Intrest{
    public static void main(String[]args){
        double final_amount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time period: ");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.print("Simple interest is: " + si);

        final_amount = p + si;
        System.out.print("\nFinal amount is: " + final_amount);
    }
}