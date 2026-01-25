package patternprinting;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int nsp =n-1;
        int nst =1;

        for (int i = 1; i <= 2*n-1 ; i++) {

            for (int j = 1; j <=nsp ; j++) {
                System.out.print("  ");

            }
            for (int k = 1; k <= nst ; k++) {
                System.out.print("* ");

            }
            if( i < n){
                nst+=2;
                nsp--;
            }
            else {
                nst-=2;
                nsp++;
            }
            System.out.println();
        }
    }
}
