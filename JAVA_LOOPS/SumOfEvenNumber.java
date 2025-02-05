import java.util.Scanner;
public class SumOfEvenNumber{
    public static void main(String[]args){
        System.out.print("Enter a number to find sum of natural no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int evenNumber = 2;
        for(int i = 1; i <= n; i++){ 
            sum += evenNumber;
            evenNumber += 2;
        }
        System.out.print("the sum of first"+ n + "even number is "+sum);
    }
}