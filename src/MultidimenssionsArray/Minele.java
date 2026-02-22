package MultidimenssionsArray;

public class Minele {
    public static void main(String[] args) {
       int[][] arr =  {{100,2,2,3,4},{500,89,6,7,8},{90,23,10,11,12}};
        MinimumELE(arr);
    }

    public static void MinimumELE(int[][] arr) {
        int ele = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(ele > arr[i][j]){
                    ele = arr[i][j];
                }
            }
        }
        System.out.println(ele);

    }
}
