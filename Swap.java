package Challanges;
import java.util.*;
public class Swap {
    public  static  void main(String [] args){
        System.out.println("Before Swap");
        System.out.println("Enter B");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");

        int a= sc.nextInt();

        int b=sc.nextInt();
        System.out.println("After Swap");
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}
