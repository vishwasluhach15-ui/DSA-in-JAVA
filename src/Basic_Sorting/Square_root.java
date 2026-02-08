package Basic_Sorting;

public class Square_root {
    public static void main(String[] args) {
        int n = 16 ;
        int hi = n ;
        int lo = 1 ;
        int root = 0 ;
        boolean flag = false ;
        while(hi>= lo ){
            int mid =( hi + lo )/2;
            root = lo ;
            if(mid* mid  > n ) hi = mid-1 ;
            else if(mid* mid < n ) {
                lo = mid + 1 ;
                root = hi ;
            }else{
                System.out.println(mid);
                flag = true ;
                break ;
            }
        }
        if(!flag){
            System.out.println(root);
        }
    }
}
