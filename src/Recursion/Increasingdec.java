package Recursion;
// if n = 5 then output will be 5 4 3 2 1 2 3 4 5
import java.util.Scanner;
public class Increasingdec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n ) {
        if(n == 0) return ;

        if(n!=1)System.out.print(n+" ");

        print(n-1);
        System.out.print(n+" ");

    }



}


