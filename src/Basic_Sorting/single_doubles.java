package Basic_Sorting;

public class single_doubles {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 6, 6, 7, 7, 9, 9, 11, 11};
        System.out.println(Single_amond_dubls(arr));
    }
    public static int Single_amond_dubls(int[] arr ){
        int n = arr.length;
        if(n==1)return arr[0];
        if(arr[0]!= arr[1]) return arr[0];
        if(arr[n-1]!= arr[n-2]) return arr[n-2];
        int hi = arr.length -1 ;
        int lo = 0 ;
        while(lo <= hi ){
            int mid = lo + ( hi - lo )/2 ;
            if(arr[mid]!= arr[mid-1] && arr[mid]!= arr[mid+1]){
                return arr[mid];
            }
            int s = mid , f = mid ;
            if(arr[mid]== arr[mid-1])f = mid -1 ;
            else s = mid +1 ;

        }
        return 0 ;
    }
}
