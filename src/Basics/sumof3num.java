 package Basics;
 import java.util.Scanner;
public class sumof3num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 1 st number: ");
        a = sc.nextInt();
        System.out.print("Enter 2 nd number: ");
        b= sc.nextInt();
        System.out.print("Enter 3 rd number: ");
        c= sc.nextInt();
        System.out.println("Sum of 3 terms is : "+(a+b+c));

    }
}
