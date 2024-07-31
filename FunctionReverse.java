package Challanges;
import java.util.Scanner;
public class FunctionReverse {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int d=rev(a);
        System.out.println(d);
    }
    public static int rev(int a){
       int  ret=0;
       while ((a>0)){
           ret=ret*10+a%10;
           a/=10;
       }
       return ret;

    }
}
