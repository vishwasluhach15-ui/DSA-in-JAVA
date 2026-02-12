package strings;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Character> s = new ArrayList<>();
        s.add('a');
        s.add('b');
        s.set(0,'k');
        System.out.println(s);
        StringBuilder str = new StringBuilder("Vishwas");
        System.out.println(str);
    }
}
