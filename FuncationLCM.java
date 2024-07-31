package Challanges;
import java.util.Scanner;
public class FuncationLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter b number");
        int b=sc.nextInt();
        int d=lcm(a,b);
        System.out.println(d);
    }
    public static int lcm(int a,int b){
        int r=1;
        while (true){
            int fac=a*r;
            if(fac%b==0){
                return fac;
            }
            r++;

        }


    }
}
