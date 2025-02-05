import java.util.Scanner;
public class MultiplyOfTable{
    public static void main(String[]args){
        System.out.print("enter a number whose table you want to cal: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }
        
    }
}