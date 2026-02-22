package MultidimenssionsArray;

import static MultidimenssionsArray.TransposeArray.print;

public class RotateArr90d {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1}};
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("Before Transposing Matrix : ");
        print(arr);
        int[][] arr2 = new int[m][n];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j]= arr[n-j-1][i];

            }

        }
        System.out.println("After Transposing Matrix : ");
        print(arr2);
    }
}
