package Binary_Search;

public class find_peek_in_mountain_array {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,5,6,8,6,3};
        int lo = 1 ;
        int hi = arr.length-2 ;
        while(hi >= lo ){
            int mid =( hi + lo ) / 2 ;
            if(arr[mid]>arr[mid+1] && arr[mid]> arr[mid-1]){
                System.out.println("Peak found at index :"+mid+" and number is "+arr[mid]);
                break ;
            } else if (arr[mid]<arr[mid+1] && arr[mid]> arr[mid-1]) {
                lo = mid +1;
            }else hi = mid -1 ;
        }
    }
}
