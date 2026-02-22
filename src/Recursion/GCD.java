package Recursion;

public class GCD {
    public static void main(String[] args) {
        int n = 30 ;
        int m = 10 ;
        int hcf = 0 ;
        for (int i = 1; i <= Math.min(n,m); i++) {
            if(n%i==0 && m%i==0)hcf = i ;
        }
        System.out.println(hcf);
    }

}
