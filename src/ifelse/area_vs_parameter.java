package ifelse;
import java.util.Scanner;
public class area_vs_parameter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length and breath : ");
        int l = sc.nextInt();
        int br= sc.nextInt();
        int ar= l*br;
        int peri= 2*(l+br);
        if(ar > peri){
            System.out.println("Area is greater than perimeter");
        } else if (ar < peri ) {
            System.out.println("Area is less than perimeter");
        }
        else{
            System.out.println("area = perimeter ");
        }

    }
}
