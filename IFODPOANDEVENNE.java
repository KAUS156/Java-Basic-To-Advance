package Challanges;
import java.util.Scanner;
public class IFODPOANDEVENNE {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int result=0;
        for(int i=1;i<=a;i++){
            if(i%2==0){
                result-=i;
            }
            else {
                result+=i;
            }

        }
        System.out.println(result);
    }
}
