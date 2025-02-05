import java.util.Scanner;

public class UnitConversion{
    public static void main(String[]args){
        System.out.print("conversion of km to miles");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nenter the km you want to convert to miles: ");
        float a = sc.nextFloat();
        float c = a*0.621371f;

        System.out.print("\nthe miles is "+c);


    }
}