package ifelse;

import java.util.Scanner;

public class digit4ornot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        if(n>999 && n<=9999){
            System.out.println("Yes , This number is of 4 digits ");
        }
        else{
            System.out.println("NO , this is not of 4 digits");
        }
    }
}
