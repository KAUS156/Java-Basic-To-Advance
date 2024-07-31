package Challanges;
import java.util.*;
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int sum=0;

        while(a>0){
            a=a/10;
            sum++;
        }
        System.out.println(sum);
        }
    }


