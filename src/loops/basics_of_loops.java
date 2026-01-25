package loops;
import java.util.Scanner;
public class basics_of_loops {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        for(int i =1 ;i<=n ;i++){
            System.out.print(i+"  ");
        }
    }
}
