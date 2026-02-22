package Recursion;
import java.util.Scanner;
public class PrintingOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,12,43,45,67,78,86,90,99,101,123,124};
//        System.out.println("normal printed array :  ");
//        Print(arr,0);
//        System.out.println();
//        System.out.println("Reversed array :  ");
//        RevPrint(arr, 0);
        System.out.println("enter any number to search in array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(Exist(arr, n,0));
        System.out.println(Search(arr , n ));
    }
    public static boolean Exist(int[] arr , int n , int x ){
        if (arr.length-1 < x  ) return false;
        if(arr[x] == n ) return true ;
        return Exist(arr, n , x+1 );
    }
    public static int BinaryExist(int[] arr , int tar , int lo , int hi ) {
        if(lo>hi) return -1  ;
        int mid = lo + (hi-lo)/2 ;
        if(arr[mid]==tar)return mid ;
        else if(arr[mid]>tar)return BinaryExist(arr,tar,0,mid-1) ;
        else return BinaryExist(arr,tar,mid+1,hi);
    }

    public static int Search(int[] arr , int tar ) {
        int n = arr.length;
        return BinaryExist(arr,tar,0 , n-1);


    }


    public static void Print(int[] arr, int idx) {
        if(idx==arr.length) return ;
        System.out.print(arr[idx]+" ");
        Print(arr, idx+1);

    }
    public static void RevPrint(int[] arr, int idx) {
        if(idx==arr.length) return ;
        RevPrint(arr, idx+1);
        System.out.print(arr[idx]+" ");


    }

}
