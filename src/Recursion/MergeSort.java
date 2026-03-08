package Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,9,8,6,4,3,2,5,7};
        sort(arr);
        for(int ele : arr ) System.out.print(ele+"  ");
    }
    public static void sort(int[] arr ){
        int n = arr.length;
        if(n==1)return ;
        // step 1 divide array into two parts
        int[] a  =new int[n/2];   int[] b = new int[n-n/2];
        int idx = 0 ;
        //step 2 copy array into new arrays parts
        for (int i = 0; i <a.length ; i++)a[i]=arr[idx++];
        for(int i = 0 ; i<b.length;i++)b[i]=arr[idx++];
        // step 3 apply magic or sort them
        sort(a);  sort(b);
        // merge both arrays
        merge(a,b,arr);
        // print arr
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int k = 0 ;int i = 0; int j = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j])  c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length)c[k++]=a[i++];
        while(j<b.length)c[k++]=b[j++];

    }
}
