package Basic_Sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {190,6,7,10,98,100};
        print(arr);
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            int swap =0 ;
            for (int i = 0; i < n - 1 - j; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++;
                }

            }
            if(swap==0)break ;
        }

        print(arr);
    }
    public static void print(int[] arr ){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
