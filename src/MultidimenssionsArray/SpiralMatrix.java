package MultidimenssionsArray;
import java.util.List ;
import java.util.ArrayList;

import static MultidimenssionsArray.TransposeArray.print;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        print(arr);
        System.out.println("printing in spiral : ");
        System.out.println(spiralOrder(arr));
    }
    public static List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr[0].length , m = arr.length ;
        int fr = 0 , lr = m-1 ; int fc = 0, lc = n-1 ;
        while(fr<=lr && fc<=lc){
            for(int i = fr ; i<=lc;i++)ans.add(arr[fc][i]);
            fc++;
            if(fr>lr || fc>lc)break ;
            for(int i = fc ; i<=lr;i++)ans.add(arr[i][lc]);
            lc--;
            if(fr>lr || fc>lc)break ;
            for(int i = lc; i>=fr;i--)ans.add(arr[lr][i]);
            lr--;
            if(fr>lr || fc>lc)break ;
            for(int i = lr ; i>=fc ;i--)ans.add(arr[i][fr]);
            fr++;
        }
        return ans ;
    }
}
