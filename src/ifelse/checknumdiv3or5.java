package ifelse;
import java.util.Scanner;
public class checknumdiv3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double n = sc.nextDouble();
        if(n%3 ==0){
            if(n%5==0){
                System.out.println("This number is divisible by both 3 and 5");
            }else{
                System.out.println("This number is divisible by 3 only ");
            }
        }else if(n%5==0){
            System.out.println("This number is divisible by 5 only ");
        }
        else{
            System.out.println("this number is neither divisible by 3 and nor 5");
        }
    }
}
