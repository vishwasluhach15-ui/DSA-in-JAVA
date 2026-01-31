package Binary_Search;
import java.util.Arrays ;

import static arrays.ArraySortBuiltin.print;

public class first_uccrence {
    public static void main(String[] args) {
        int[] arr = {1,2 ,32,43,21,49,49,10,19,-9,-12,-32,49,59,67,234,183,0};
        Arrays.sort(arr);
        print(arr);
        int n = arr.length;
        int lo = 0 ;
        int idx = -1 ;
        int trg = 49 ;
        int hi = n-1 ;
        while(hi >= lo ){
            int mid = ( lo + hi ) / 2 ;
            if(arr[mid] > trg ){
                hi = mid - 1 ;
            }
            else if(arr[mid] < trg ){
                lo = mid +1 ;
            }else{
                idx =mid ;
                hi = mid - 1 ;
            }
        }
        System.out.println("number found at idx : "+ idx );

    }
}
