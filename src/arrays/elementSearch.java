package arrays;
import java.util.Scanner;
public class elementSearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,12,42,21,92};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element u want to search : ");
        int x = sc.nextInt();
        search(arr,x);


    }
    public static void search(int[] brr, int de){
        boolean flag = false ;
        for (int i = 0; i <brr.length ; i++) {

            if(brr[i] == de){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("yes found in array ");
        }else{
            System.out.println("Not found ");
        }
    }
}
