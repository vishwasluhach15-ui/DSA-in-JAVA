package Recursion;
public class FindMissing {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(finding(arr));
    }

    private static int finding(int[] arr) {
        int n = arr.length+1 ; int i = 0 ;
        while(i<arr.length){
            if(arr[i]==i+1 || arr[i]==n)i++;
            else{
                int idx = arr[i]-1 ;
                swap(idx , i, arr);
            }
        }
        for (i = 0; i< arr.length ; i++ ) {
            if(arr[i]!=i+1)return i+1;
        }
        return n ;
    }

    private static void swap(int idx, int i, int[] arr) {
        int temp = arr[i];
        arr[i]= arr[idx];
        arr[idx]= temp ;
    }
}
