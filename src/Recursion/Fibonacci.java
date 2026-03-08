package Recursion;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(fibonaccirec(n));
    }

    public static int fibonaccirec(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonaccirec(n-1) + fibonaccirec(n-2);
    }
}