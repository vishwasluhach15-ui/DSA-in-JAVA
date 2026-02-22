package MultidimenssionsArray;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(search(arr , 18 ));
    }
    public static boolean search(int[][] arr,int tar ){
        int i = 0 ;
        int n = arr.length;
        int m = arr[0].length;
        int j = n-1;
        while(i<m && j>=0 ){
            if(arr[i][j]>tar)j--;
            else if (arr[i][j]<tar)i++;
            else return true ;
        }
        return false;

    }
}
