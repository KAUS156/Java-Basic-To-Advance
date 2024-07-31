
package Challanges;
import java.util.Scanner;

public class AreaofRectangle {
    public  static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Side A");
        Float a=sc.nextFloat();
        System.out.println("Enter Side B");
        Float b=sc.nextFloat();
        Float Area=(a*b)*1/2;
        System.out.println( Area);
    }
}
