package Binary_Search;

public class binary_sort_desc {
    public static void main(String[] args) {
        int[] arr ={1,22,34,345,222,223,23,45,51,67,89,203,50,54,34,31,-2,-5,-3,95};
        for (int i = 0; i <arr.length - 1; i++) {
            boolean flag = false ;
            for (int j = 0 ; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true ;
                }
            }
            if(!flag) break ;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int tar = 50 ;
        int lo = 0 ;
        int hi = arr.length-1 ;
        while(hi >= lo ){
            int mid = (hi + lo )/ 2;
            if(arr[mid] > tar)hi = mid -1 ;
            else if (arr[mid]< tar) lo = mid +1 ;
            else{
                System.out.println("number found at index : "+mid);
                break ;
            }
        }

    }
}
