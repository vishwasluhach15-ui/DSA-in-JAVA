package arrays;

public class Saggregate0nd1s {
//    only function
        public static void main(String[] args) {
            int[] arr ={0,1,0,1,1,0,0,1};
            segregate0and1(arr);
        }
        public static void segregate0and1(int[] arr) {
            // code here
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                if (arr[i] == 0) {
                    i++;
                }
                if (arr[i] == 1 && arr[j] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;

                }
                if (arr[i] == 0 && arr[j] == 0) i++;
                if (arr[i] == 1 && arr[j] == 1) j--;


            }
        }
}
