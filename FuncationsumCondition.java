package Challanges;
import java.util.Scanner;
public class FuncationsumCondition {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int u=cp(s);
        System.out.println(u);
    }
    public static int cp(int s){
        int sum=0;
        for(int i=0;i<=s;i++){

            if((i&1)==1){
                sum+=i;
            }
            else {
                sum-=i;
            }
        }
        return sum;
    }
}
