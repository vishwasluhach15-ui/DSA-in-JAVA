package arrays;

public class printnegitive {
    static void main(String[] args) {
        int arr[] ={1 ,32,12,34,-6,-7 } ;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<0) System.out.print(arr[i]+"  ");
        }
    }
}
