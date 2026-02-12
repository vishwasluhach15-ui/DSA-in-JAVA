package strings;

public class compareto {
    public static void main(String[] args) {
        String x = "Vishwas";
        String y = "Vishu";
        int n = x.compareTo(y);
        Compare_two(x,y);

    }
    public static void Compare_two(String a , String b ){
        for (int i = 0; i <= a.length()-1 && i <=  b.length()-1 ; i++) {
            int n = a.charAt(i) ;
            int m = b.charAt(i) ;
            if(a.charAt(i) != b.charAt(i)){
                System.out.println(n-m);
            }

        }
    }
}
