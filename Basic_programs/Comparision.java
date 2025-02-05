import java.util.Scanner;
public class Comparision{
    public static void main(String[]args){
        System.out.println("given number is 35");
        System.out.print("\nenter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>35){
            System.out.println("the number is greater than 35");
        }
        else if(a<35){
            System.out.println("the number is less than 35");
        }
        else{
            System.out.println("the number is equal to 35");
        }
        
    }
}