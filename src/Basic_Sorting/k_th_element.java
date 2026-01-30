package Basic_Sorting;

import static Basic_Sorting.selection_Sort_largest_1st.print;

public class k_th_element {
    public static void main(String[] args) {
        int[] arr={1,43,46,78,99,13,12,45,-1,-14};
        int k = 3 ;
        int i = 0 ;
        print(arr);
        for (int j = 0; j < k; j++) {
            int idx = -1 ;
            int ele = Integer.MAX_VALUE;
            for (int l = j; l < arr.length ; l++) {
                if(ele > arr[l]){
                    ele = arr[l];
                    idx = l ;
                }

            }
            int temp = arr[j];
            arr[j] = arr[idx];
            arr[idx] = temp ;

        }
        print(arr);
        System.out.println(arr[k-1]);


    }

}
