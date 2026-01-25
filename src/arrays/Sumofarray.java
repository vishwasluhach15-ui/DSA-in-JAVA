package arrays;
import java.util.Scanner;
public class Sumofarray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all Element : ");
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The Sum of arr is : ");
        int x = 0 ;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+" ");
            System.out.print("+ ");
            x+= arr[i];

        }
        System.out.print("0 :"+x);

    }
}
