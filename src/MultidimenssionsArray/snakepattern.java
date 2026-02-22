package MultidimenssionsArray;

public class snakepattern {
    public static void main(String[] args) {
        int[][] arr = {{12,23,11,65,68},{67,64,97,44,24},{24,43,57,26,87},{90,18,13,54,57}};
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for (int j = arr[0].length-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }

            }
            System.out.println();
        }
    }
}
