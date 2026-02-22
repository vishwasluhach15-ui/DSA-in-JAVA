package Basic_Sorting;

public class Insertion_Srt {
    public static void main(String[] args) {
        int[] arr = {1,32,43,2,12,10,9,-7,0};
        for (int i = 1; i <arr.length ; i++) {
            int j = i ;
            while(j>0 && arr[j]< arr[j-1] ){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = temp ;
                j--;

            }
            for(int ele: arr){
                System.out.print(ele+" ");
            }
            System.out.println();

        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
