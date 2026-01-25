package ifelse;
import java.util.Scanner;
public class oddeventernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        System.out.println(n%2==0 ? "Even" : "Odd");

    }
}
