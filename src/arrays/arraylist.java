package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(9);
        arr.add(18);
        arr.add(45);
        arr.add(12);
        arr.add(27);
        System.out.println(arr.get(3));
        arr.set(3,7);
        System.out.println(arr.get(3));

        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
//        Collections.reverse(arr);
        System.out.println(arr);
//        reverse of arr
        int i =0 ;
        int j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;


        }
        System.out.println(arr);


    }
}
