package Binary_Search;

import java.util.Arrays;

public class binary_Search1 {
    public static void main(String[] args) {
        int[] arr = { 1,23,43,76,768,5,645,423,431,53,12,134,102,23,203,31,-2,-4,-8,-123};
        Arrays.sort(arr);
        for(int ele : arr ){
            System.out.print(ele+"  ");
        }
        System.out.println();
        int tar = 102;int lo = 0 ;
        int n = arr.length;int hi = n -1 ;
        boolean flag = false ;
        while(hi >=  lo ){
            int mid = ( hi + lo ) / 2;
            if(arr[mid] > tar ){
                hi = mid - 1 ;
            } else if (arr[mid]< tar) {
                lo = mid +1 ;
            }
            else{
                flag = true ;
                break ;
            }
        }
        if(flag){
            System.out.println("Number found ");
        }else System.out.println("Nope ");

    }
}