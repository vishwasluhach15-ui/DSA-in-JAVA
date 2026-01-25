package Basics;
import java.util.Scanner;
public class simple_intrust {
    static void main() {
        Scanner sc= new Scanner(System.in);
        double p ,r,t,si;
        System.out.print("Enter Principal amount : ");
        p = sc.nextInt();
        System.out.print("Enter rate : ");
        r = sc.nextInt();
        System.out.print("Enter year : ");
        t = sc.nextInt();

        si = (p*r*t)/100;
        System.out.println("Simple Intrest => "+si);

    }
}
