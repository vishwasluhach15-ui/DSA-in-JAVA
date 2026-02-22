package MultidimenssionsArray;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        System.out.println("Before Transposing Matrix ");
        print(arr);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

//             swap karna hai ab
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;

            }
        }
        System.out.println("After Transposing Matrix : ");
        print(arr);
    }

    public static void print(int[][] array ) {
        for(int[] row : array){
            for(int ele : row ){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
