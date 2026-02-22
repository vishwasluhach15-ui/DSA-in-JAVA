package Recursion;

public class CountWays {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(StairsCount(n ));
    }

    public static int StairsCount(int n ) {
        if(n==1) return 1 ;
        if(n==2) return 2 ;
        return StairsCount(n-1)+StairsCount(n-2);

    }
}
