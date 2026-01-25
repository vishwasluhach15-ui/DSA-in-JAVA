package arrays;

import java.util.Arrays;

public class ArraySortBuiltin {
    public static void main(String[] args) {
        int[] arr = {12,54,65,-12,32,87,-68,-78  };
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] brr){
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+"  ");
        }
        System.out.println();
    }
}
