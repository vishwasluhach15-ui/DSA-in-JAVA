package arrays;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr ={12,43,35,12,65,46};
//        int[] x = arr; // x is shallow Copy of arr
        int[] deep = Arrays.copyOf(arr,arr.length);

        deep[3]= 23;
        System.out.println(arr[3]);
        System.out.println(deep[3]);

    }
}
