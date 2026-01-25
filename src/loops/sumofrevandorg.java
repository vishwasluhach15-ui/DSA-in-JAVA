package loops;
import java.util.Scanner;
public class sumofrevandorg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int rsum = 0;
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            r *= 10;
            r += (n % 10);
            n /= 10;
        }
        while (r != 0) {
            rsum += (r % 10);
            r /= 10;
        }
        System.out.println("Sum of original and reverse =>"+(sum+rsum));
    }

}
