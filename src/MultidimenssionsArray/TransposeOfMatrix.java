package MultidimenssionsArray;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{12,23,11,65,68},{67,64,97,44,24},{24,43,57,26,87}};
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
