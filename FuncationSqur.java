package Challanges;
import java.util.Scanner;

public class FuncationSqur {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int as=um(s);
        System.out.println(as);

    }
    public static int um(int s){
        int b=5;
        int ans=1;
        for(int i=1;i<=b;i++){
            ans=ans*s;
        }
        return ans;

    }
}
