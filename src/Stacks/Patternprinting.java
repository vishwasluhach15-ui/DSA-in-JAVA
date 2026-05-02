package Stacks;

import java.util.*;
public class Patternprinting {
    public static void main(String[] args) {
        // taking input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        //making an infinite while loop to take user input
        while(true){
            int no = sc.nextInt();
            if(no < 0){
                break;
            }
            arr.add(no);
        }

        // declaring variables
        int max = Collections.max(arr);
        int arr_length = arr.size();

        for(int i =0; i <= max; i ++){
            for(int j = 0 ; j < arr_length;j++){
                if(arr.get(j) == 0){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                    arr.set(j,arr.get(j)-1);
                }
            }
            System.out.println();
        }
    }
}
