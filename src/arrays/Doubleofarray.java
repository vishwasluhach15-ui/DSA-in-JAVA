package arrays;

import java.util.Scanner;

public class Doubleofarray {
    static void main(String[] args) {
        int[] arr = new int[5];
        System.out.print("Enter all element of array : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i]= sc.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]*2+"  ");
        }
    }
}
