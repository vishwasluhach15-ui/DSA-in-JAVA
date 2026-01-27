package methods;
import java.util.Scanner;
public class findmaximumamound4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any 4 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));



    }
}
