package Challanges;
import java.util.*;
public class CheckNumberPoNe {
    public static void main(String [] args){
        System.out.println("Enter A number");
       Scanner sc = new  Scanner(System.in) ;
       int a=sc.nextInt();
       if(a>0){
           System.out.println("Number is Positive " +a);

       }
       else if(a<0){
           System.out.println("Number is Negative " +a);
       }
       else {
           System.out.println("Number is Not Positive Not Negative " +a);
       }
    }
}
