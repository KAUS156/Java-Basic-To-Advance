package Challanges;
import java.util.Scanner;
public class FunctionCount {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner((System.in));
        int a=sc.nextInt();
        int c=coun(a);
        System.out.println(c);
    }
    public static int coun(int a){
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
        return  count;
    }

}
