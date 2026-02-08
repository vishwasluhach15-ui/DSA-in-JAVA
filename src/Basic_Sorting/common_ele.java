package Basic_Sorting;
import java.util.ArrayList;
import java.util.Arrays;
public class common_ele {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,9,10};
        int[] arr1 = {9,1,2,3,5,3,9,9,8};
        System.out.println(commonElements(arr,arr1));
    }
    public static ArrayList<Integer> commonElements(int[] a, int[] b) {
            // Your code here
        ArrayList<Integer> ans =new ArrayList<>();
        Arrays.sort(a); Arrays.sort(b);
        int i = 0 ; int j = 0 ;
        while(a.length > i && b.length >j){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]) j++;
            else i++;
        }return ans ;
    }

}
