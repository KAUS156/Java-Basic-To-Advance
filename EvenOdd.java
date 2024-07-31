package Challanges;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner (System.in);
        int s=sc.nextInt();
        if((s&1)==1){
            System.out.println("Odd number" + s);
        }
        else {
            System.out.println("even number" + s);
        }
    }
}
