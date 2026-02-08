package Basic_Sorting;

public class selection_Sort_largest_1st {
//    approach 1
    public static void main(String[] args) {
        int[] arr={1,23,54,56,0,-3,45};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n-1; i++) {
            int max = Integer.MIN_VALUE;
            int idx = -1;
            for (int j = i; j < n ; j++) {
                if(max < arr[j]){
                    max= arr[j];
                    idx = j;
                }

            }
//            System.out.println(idx+"   "+max);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp ;

        }
        print(arr);

    }
//    approach 2
//public static void main(String[] args) {
//    int[] arr= {12,53,0,-9,5,3};
//    int n = arr.length;
//    print(arr);
//    for (int i = 0; i <n-1 ; i++) {
//        int max = Integer.MIN_VALUE;
//        int idx = -1 ;
//        for (int j = n-i-1; j >= 0  ; j--) {
//            if(arr[j]>max){
//                max = arr[j];
//                idx = j;
//            }
//        }
//        int temp = arr[n-i-1];
//        arr[n-i-1]= arr[idx];
//        arr[idx] = temp ;
//
//    }
//    print(arr);
//}
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
