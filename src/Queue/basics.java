package Queue;
import java.util.Stack ;
import java.util.ArrayDeque;
import java.util.Queue ;
public class basics {
    public static void printQueue(Queue<Integer> ab){
        for(int i = 0 ; i<ab.size();i++){
            int x = ab.poll();
            System.out.print(x+" ");
            ab.add(x);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>() ;
        q.add(1);q.add(2);
        q.add(3);q.add(4);q.add(90);
        printQueue(q);
        addAtIdx(q,2,40);
        printQueue(q);
//        q.peek();
        ReverseAQueue(q);
        printQueue(q);
        removeKelement(q,3);
        printQueue(q);
    }

    private static void removeKelement(Queue<Integer> q, int k) {
        int n = q.size() ;
        Stack<Integer> st = new Stack<>();
        for(int i = 1 ; i<= k ; i++){
            st.push(q.remove());
        }
        for(int i = 1 ; i<= k ; i++){
            q.add(st.pop());
        }
        for(int i =  1; i<= n-k ; i++){
            q.add(q.remove());
        }
    }

    private static void ReverseAQueue(Queue<Integer> q) {
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i =0 ; i< n ; i++){
            st.add(q.remove()) ;

        }
        for(int i = 0 ; i<n ; i++){
            q.add(st.pop());
        }
    }


    private static void addAtIdx(Queue<Integer> ab, int idx, int val) {
        for(int i = 1 ; i<= idx ; i++){
            ab.add(ab.remove());
        }
        ab.add(val);
        for(int i = 1 ; i< ab.size()-idx ; i++){
            ab.add(ab.remove());
        }

    }
}
