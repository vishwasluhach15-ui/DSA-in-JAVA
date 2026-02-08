package Basic_Sorting;

import static Basic_Sorting.bubbleSortdesc.print;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,13,34,-2,3,39,0,-9,12};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n-1 ; i++) {
            int idx = -1;
            int min = Integer.MAX_VALUE;
            for(int j = i ; j< n ;j++){
                if(min> arr[j]){
                    min= arr[j];
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp ;
        }
        print(arr);
    }
}
