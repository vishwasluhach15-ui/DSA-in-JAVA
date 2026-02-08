package strings;
import java.util.Scanner;
public class palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0 ;
        int j = str.length()-1 ;
        boolean flag = true ;
        while(i<=j){
            if(str.charAt(j)==str.charAt(i)){
                i++;
                j--;
            }
            else{
                flag = false ;
                break ;
            }
        }
        if(flag) System.out.println("yes palindrome");
        else{
            System.out.println("not palindrome");
        }
    }
}
