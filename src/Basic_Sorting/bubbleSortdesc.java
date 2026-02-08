package Basic_Sorting;
public class bubbleSortdesc {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        print(arr); int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int isSorted =0 ;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]< arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    isSorted++;
                }
            }
            if(isSorted==0){
                break ;
            }
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
