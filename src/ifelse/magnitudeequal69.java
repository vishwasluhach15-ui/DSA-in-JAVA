package ifelse;

import java.util.Scanner;

public class magnitudeequal69 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int n = sc.nextInt();
        if(n<0){
            if((-1*n)==69){
                System.out.println("Yes the magnitude is 69");
            }else {
                System.out.println("NO , the magnitude of given integr is not 69");
            }
        }else if(n==69){
            System.out.println("Yes the magnitude is 69");
        }else {
            System.out.println("NO , the magnitude of given integr is not 69");
        }
    }
}
