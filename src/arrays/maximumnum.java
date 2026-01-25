package arrays;

import java.util.Scanner;

public class maximumnum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all Element : ");
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }
        System.out.println("Maximum number in array is : "+max);
    }
}