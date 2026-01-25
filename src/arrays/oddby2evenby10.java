package arrays;

public class oddby2evenby10 {
    public static void main(String[] args) {
        int[] arr ={12 ,31,13,53,49,58,72};
        modify(arr);
        print(arr);
    }
    public static void modify(int[] brr){
        for (int i = 0; i < brr.length; i++) {
            if(i%2==0){
                brr[i]+=10;
            }
            else brr[i]*= 2;
        }
    }

    public static void print(int[] brr ) {
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+"  ");

        }
        System.out.println();
    }
}
