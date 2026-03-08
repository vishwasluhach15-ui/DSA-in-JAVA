package Recursion;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr ={7,0,6,5,4,3,2,1};
        cyclesort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

    private static void cyclesort(int[] arr) {
        int n = arr.length;
        int i = 0 ;
        while(i<n ){
            if(arr[i]==i)i++;
            else{
                int idx = arr[i];
                int temp= arr[i];
                arr[i]= arr[idx];
                arr[idx]= temp ;

            }
        }
    }
}
