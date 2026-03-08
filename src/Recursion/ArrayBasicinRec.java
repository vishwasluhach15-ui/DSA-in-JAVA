package Recursion;

import java.util.ArrayList;

public class ArrayBasicinRec {
    public static void main(String[] args) {
        ArrayList<String> st =new ArrayList<>();
        st.add("Vishwas");
        st.add("Vanshu ");
        st.add("Vikrant");
        System.out.println(st);
        change(st);
        System.out.println(st);
    }

    private static void change(ArrayList<String> st) {
        st.add("Tinku ");
        st.add("kamal");
        st.remove(1);
    }
}
