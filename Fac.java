package Challanges;
import java.util.Scanner;
public class Fac {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d=num(a);
        System.out.println(d);
    }

    public static int num(int a) {
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac = fac * i;
        }
            return fac;



}}
