package patternprinting;
import java.util.Scanner;
public class horizantalalbha {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }

    }
}
