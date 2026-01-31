package arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr={12,24,56,-1,3,2,43,5,-3,7,10};
        int trg= 8;
        find(arr,trg);
    }

    public static void find(int[] brr , int n ) {
        int found = 0;
        for (int i = 0; i < brr.length; i++) {

            for (int j = i+1; j < brr.length ; j++) {

                if(brr[i]+ brr[j]== n ){
                    System.out.println("Found sum of 2 number is equal to target : "+brr[i]+" + "+brr[j]+" = "+n);
                    found =1 ;
                }

            }


        }
        if(found ==0){
            System.out.println("not found!!");
        }
    }
}
