package MultidimenssionsArray;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        a.add(13); a.add(36);a.add(32);
        ArrayList <Integer> b = new ArrayList<>();
        b.add(16); b.add(12);b.add(22);
        ArrayList <Integer> c = new ArrayList<>();
        c.add(48); c.add(13);c.add(7);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);
//        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j)+"  ");
            }
            System.out.println();
        }

    }
}
