package arrays;
import java.util.Scanner;

public class input_output {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all Elements of array : ");
        for (int i = 0; i <=n-1; i++) {
            arr[i]= sc.nextInt();

        }
        System.out.print("You have entered this array :-> ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }

    }
}
