package ifelse;
import java.util.Scanner;
public class biggestfrom3num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is biggest ");
        }else if(b>a && b>c){
            System.out.println(b+" is biggest ");
        }else if(c>a && c>b){
            System.out.println(c+" is biggest ");
        }else{
            System.out.println("Something went wrong");
        }
    }
}
