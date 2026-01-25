package ifelse;
import java.util.Scanner;
public class profitandloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price :");
        double cp = sc.nextDouble();
        System.out.print("Enter selling Price :");
        double sp = sc.nextDouble();
        if(cp > sp ){
            System.out.println("Loss by :" +(cp-sp)+" rs and by "+(double)(((cp-sp) /cp)*100)+"%");
        }
        else if(cp < sp ){
            System.out.println("Profit by : "+(sp-cp)+" rs and by "+(double)((sp-cp)/cp*100)+"%");
        }else{
            System.out.println("No Profit No Loss !!!!!");
        }


    }
}
