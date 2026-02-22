package Recursion;

import java.util.Scanner;

public class UniquePath {
    public static void main(String[] args){
        System.out.print("Enter rows :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter column : ");
        int b = sc.nextInt();
        System.out.println(Funiqpath(a,b));
    }
    public static int Funiqpath(int a , int b ){
        if(a ==1 || b== 1 ) return 1 ;
        return Funiqpath(a-1,b)+Funiqpath(a,b-1);
    }
}
