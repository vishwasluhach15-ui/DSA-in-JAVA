package MultidimenssionsArray;

import java.util.ArrayList;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][]  a={{1,2},{3,4}};
        int[][]  b={{1,2},{3,4}};

        System.out.println(Multiply(a, b ));
    }
    public static ArrayList<ArrayList<Integer>> Multiply (int[][] a , int[][] b){
        int n = a.length ;
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j]+= (a[i][k]*b[k][j]);

                }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j <n ; j++) {
                ans.get(i).add(c[i][j]);
            }
        }
        return ans ;

    }
}
