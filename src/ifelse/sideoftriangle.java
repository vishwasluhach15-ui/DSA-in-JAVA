package ifelse;
import java.util.Scanner;
public class sideoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 st side : ");
        int a =sc.nextInt();
        System.out.print("Enter 2nd side : ");
        int b =sc.nextInt();
        System.out.print("Enter 3rd side : ");
        int c =sc.nextInt();
        if(a+b>c && c+a>b && b+c>a){
            System.out.println("Yes these are the sides of triangle");
        }
        else{
            System.out.println("No these are not the sides of triangle");
        }


    }

}
