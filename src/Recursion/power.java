package Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        System.out.print("Enter base : ");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        System.out.print("Enter Exponent : ");
        long b = sc.nextInt();
//        System.out.println(power(a,b));
        System.out.println(powerfixed(a,b));

    }
//    public static long power(long n , long m ){
//        if(m==0) return 1;
//        return n* power(n , m-1);
//    }
    public static long powerfixed(long n , long m ){
        if(m==0)return 1 ;
        long call = powerfixed(n,m/2);
        if(m%2==0)return call*call ;
        else return n*call*call;
    }
}
