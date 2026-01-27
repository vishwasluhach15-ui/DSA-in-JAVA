package Basic_Sorting;

public class moveZerosToEnd {
    public static void main(String[] args) {
        int[] arr ={ 8,0,9,7,0,6,0,8,0,12,9,0,0,4,7};
        print(arr);
        ZeroAtEnd(arr);
        print(arr);
    }
    public static void ZeroAtEnd(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int swap = 0;
            for (int j = 0; j< n-1-i; j++) {
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
