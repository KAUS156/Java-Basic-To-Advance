package Challanges;
import java.util.Scanner;
public class MultipicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();

        for(int i=1;i<=10;i++){
            int u=s*i;
            System.out.println(u);
        }



    }
}
