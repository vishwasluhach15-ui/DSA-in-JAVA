package ifelse;
import java.util.Scanner;
// check any number is odd or even
public class checknumisoddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print
                ("Enter any number : ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("This number is odd");
        }

    }
}
