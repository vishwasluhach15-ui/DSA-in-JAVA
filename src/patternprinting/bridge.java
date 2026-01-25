package patternprinting;
import java.util.Scanner;
public class bridge {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n-1 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int j = 1; j <= n-1 ; j++) {
            for (int k = 1; k <=n-j ; k++) {
                System.out.print("* ");
            }
            for (int i = 1; i <=j*2-1 ; i++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= n-j ; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
