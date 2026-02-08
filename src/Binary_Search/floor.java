package Binary_Search;

import java.util.Arrays;

public class floor {
    public static void main(String[] args) {
        int[] arr ={21,67,90,6,4,8,8,43,21,109,100, 1};
        Arrays.sort(arr);
        int tar = 11 ;
        int idx = -1;
        int hi = arr.length-1 ; int lo = 0 ;
        while(hi >= lo ){

            int mid =( hi +lo )/2 ;
            if(arr[mid]>tar)hi = mid-1 ;
            else if(arr[mid]< tar) {
                idx = mid;
                lo = mid+1 ;
            }
            else{
//                System.out.println("floor of "+tar+" is : "+arr[mid]);
                idx = mid ;
                break ;
            }
        }
        System.out.println("floor of "+tar+" is : "+arr[idx]);
    }
}
