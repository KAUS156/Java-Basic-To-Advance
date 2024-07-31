package Challanges;
import java.util.Scanner;
public class FuncationSum {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int d=sum(a);
        System.out.println(d);
    }
    public static int sum(int a){
        int sun=0;
        while (a>0){

            sun+=a%10;
            a/=10;
        }
        return sun;
    }
}
