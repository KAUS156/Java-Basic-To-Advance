package Challanges;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int rev=0;
        while(a>0){
            rev=rev*10 +a%10;
            a/=10;
        }
        System.out.println(rev);
    }
}
