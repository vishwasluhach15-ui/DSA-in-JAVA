package Binary_Search;

import java.util.Arrays;

import static Basic_Sorting.moveZerosToEnd.print;

public class first_last_occrence {
    public static void main(String[] args) {
        int[] arr = {1,21,23,12,12,45,67,-2,-3,4-9,-5,12,24,13,43,32,12};
        Arrays.sort(arr);
        print(arr);
        int lo = 0 ;
        int tar = 12;
        int n = arr.length;
        int idx = -1 ;
        int lidx = -1;
        int hi = n -1 ;
        while(hi>= lo){
            int mid = ( lo + hi ) / 2 ;
            if(arr[mid]> tar){
                hi = mid-1 ;
            } else if (arr[mid]< tar) {
                lo = mid +1 ;
            } else{// arr[mid] = tar
                idx = mid ;
                hi = mid -1;
            }
        }
        lo = 0 ;
        hi = n-1 ;
        while(hi>= lo){

            int mid = ( lo + hi ) / 2 ;
            if(arr[mid]> tar){
                hi = mid-1 ;
            }else if (arr[mid]< tar) {
                lo = mid +1 ;
            }else{// arr[mid] = tar
                lidx = mid ;
                lo  = mid + 1;
            }
        }
        System.out.println("first and last occrence are :  "+idx +", "+lidx);
    }
}
