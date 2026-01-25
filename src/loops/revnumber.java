package loops;

import java.util.Scanner;

public class revnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y =0;
        while(n!=0){
            y*=10;
            y+=(n%10);
            n/=10;
        }
        System.out.println(y);

    }
}
