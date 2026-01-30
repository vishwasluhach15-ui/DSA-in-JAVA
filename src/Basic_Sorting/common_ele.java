package Basic_Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class common_ele {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,9,10};
        int[] arr1 = {9,1,2,3,5,3,9,9,8};
        System.out.println(Common_Element(arr,arr1));

    }
    public static ArrayList <Integer> Common_Element(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0 ;
        int j = 0 ;
        ArrayList<Integer> Ans = new ArrayList<>();
        while(a.length > i && b.length >  j){
            if(a[i]== b[j]){
                Ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>a[j]){
                j++;
            }
        }
        System.out.println(Ans);
        return Ans;
    }
}
