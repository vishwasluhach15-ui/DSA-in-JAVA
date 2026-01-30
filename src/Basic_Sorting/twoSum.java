package Basic_Sorting;

import java.util.Arrays;

import static Basic_Sorting.selection_Sort_largest_1st.print;

public class twoSum {
    public static void main(String[] args) {
        int[] arr ={1,2,14,5,7,9,-1,0,3};
        int tgt = 13 ;
        Arrays.sort(arr);
        print(arr);
        int i = 0 ;
        int j = arr.length -1 ;
        while(i<j){
            if(arr[i]+arr[j]>tgt){
                j--;
            }
            else if(arr[i]+arr[j]<tgt){
                i++;
            } else if (arr[i]+arr[j]==tgt) {
                System.out.println("Number are : "+arr[i]+" , "+arr[j]+" at index :"+i +" , "+j);
                i++;
                j--;
            }

        }
        print(arr);
    }
}
