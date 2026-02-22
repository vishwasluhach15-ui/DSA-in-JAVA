package MultidimenssionsArray;

public class FindMin {
    public static void main(String[] args) {
//        Find the minimum elementOut of all the maximum element Of each row
        int[][] arr = {{12,23,11,65,68},{67,64,97,44,24},{24,43,57,26,87}};
        int min = Integer.MAX_VALUE ;
        for (int i = 0; i <arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>max) max = arr[i][j];
            }
            if(max < min) min = max ;
        }
        System.out.println(min);
    }
}
