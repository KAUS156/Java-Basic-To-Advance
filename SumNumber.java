package Challanges;
import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();

        int sum=0;
        while(a>0){

            sum+=a%10;
            a=a/10;
        }
        System.out.println(sum);
    }
}
