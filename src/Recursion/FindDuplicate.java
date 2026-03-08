package Recursion;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5,7,8,4};
        System.out.println(FindDup(arr));
    }

    private static int FindDup(int[] arr) {
        int n = arr.length+1 ;
        int i = 0 ;
        while(i<arr.length){

            if(arr[i]==i+1 || arr[i]==n)i++ ;
            else{
                int idx = arr[i]-1 ;
                if(idx!=arr[i])swap(arr,i,idx);
            }
        }
        return n ;

    }

    private static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i]= arr[idx];
        arr[idx]= temp ;
    }
}
