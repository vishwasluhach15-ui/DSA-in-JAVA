package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(4,'A','B','C');

    }
    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return ;
//        a to b via c
        hanoi(n-1,a,c,b);
//        largest from a to c
        System.out.println(a+"->"+c);
//        b to c via a
        hanoi(n-1,b,a,c);

    }
}
