import java.util.Scanner;

public class PercentageTest{
    public static void main(String[]args){
        System.out.println("Enter you marks");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total marks of this exam: ");
        float x = sc.nextFloat();
        System.out.print("enter the marks of your first subject: ");
        float a = sc.nextFloat();
        System.out.print("\nenter the marks of your second subject: ");
        float b = sc.nextFloat();
        System.out.print("\nenter the marks of your third subject: ");
        float c = sc.nextFloat();
        System.out.print("\nenter the marks of your fourth subject: ");
        float d = sc.nextFloat();
        System.out.print("\nenter the marks of your fifth subject: ");
        float e = sc.nextFloat();

        float Percentage = (a+b+c+d+e)/x*100;
        System.out.print("Your percentage is: "); 
        System.out.print(Percentage);

    }
}


