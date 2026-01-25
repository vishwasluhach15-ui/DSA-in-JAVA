package ifelse;
import java.util.Scanner;

public class integerornot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        double n = sc.nextDouble();
        double m = (int)n;
        if(m == n ){
            System.out.println("Yes this is integer");
        }else{
            System.out.println("Sorry this is not intger");
        }
    }
}
