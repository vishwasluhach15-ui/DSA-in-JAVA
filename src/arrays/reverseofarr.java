package arrays;

public class reverseofarr {
    public static void main(String[] args){
        int[] arr ={1,32,12,54,0,56,13,12,74};
        int j = 0 ;
        int k = arr.length -1 ;
        while(k>j){
            int swap = arr[k];
            arr[k]=arr[j];
            arr[j]=swap;
            j++;
            k--;
        }
        for(int ele:arr){
            System.out.print(ele+"  ");
        }
    }
}
