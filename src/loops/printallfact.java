package loops;
import java.util.Scanner;
public class printallfact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        System.out.print("Factors are : ");
        for (int i = 1; i <=Math.sqrt(n) ; i++) {

            if(n%i==0){
                System.out.print(i+"  "+n/i+"  ");
            }
        }
    }
}
