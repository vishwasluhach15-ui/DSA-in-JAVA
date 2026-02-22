package Recursion;

public class Reversenumber {
    public static void main(String[] args) {
        int n = 4569;
        int r = 0 ;
//
        System.out.println(n);
        Rev(n,r);
    }
   public static void Rev(int n ,int r ){
        if(n==0){
            System.out.println(r);
            return ;
        }
        Rev(n/10,r*10+n%10);
   }
}
