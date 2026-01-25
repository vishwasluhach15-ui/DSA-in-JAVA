package loops;
import java.util.Scanner;
// 1 n 2 n-1 3 n-2 ...
public class printseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");

        int n = sc.nextInt();
        int x = n ;
        for (int i = 1; i <= n ; i++) {
            System.out.print(i+" "+x+"  " );
            x--;
        }

    }

}
