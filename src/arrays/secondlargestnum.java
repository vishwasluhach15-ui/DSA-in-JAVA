package arrays;

public class secondlargestnum {
    public static void main(String[] args) {
        int[] arr ={1,23,34,54,12,59,32,43,51,14,15};
        int max = Integer.MIN_VALUE ;
        int smax= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if( max < arr[i]  ){
//                smax =max ;
                max =arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(smax < arr[i] && arr[i]!= max){
                smax=arr[i];

            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
