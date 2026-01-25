package loops;

import java.util.Scanner;

public class countdigitofnum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int count =0;
        int i = 0;
        while (n!=0 ) {
            n/=10;
            count ++;
            i++;
        }
        System.out.println(count);
    }
}
