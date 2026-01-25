package arrays;

public class rotatearray {
    public static void main(String[] args) {
        int[] brr = {23, 34, 54, 13, 35, 24};
        int rt = 2;
        rotateArr(brr, rt);
        for(int ele : brr){
            System.out.print(ele+"  ");
        }
    }
        static void rotateArr( int arr[], int d){
            int n = arr.length;
            d %= n;
            rev(arr, 0, d - 1);
            rev(arr, d, n - 1);
            rev(arr, 0, n - 1);
        }
        static void rev ( int[] brr, int i, int j ){
            while (i < j) {
                int temp = brr[i];
                brr[i] = brr[j];
                brr[j] = temp;
                i++;
                j--;
            }
        }

}