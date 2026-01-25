package arrays;
// Array is pass by reference
public class passingintomethod {
    public static void main(String[] args){
        int[] arr = {12,23,45,67,68};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
    public static void change(int[] brr ){
        brr[2] = 10;
    }
}

