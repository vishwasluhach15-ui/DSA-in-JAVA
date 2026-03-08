package Recursion;

public class Powerset {
    public static void main(String[] args) {
        String s ="abc";
        Subset("",s,0);
    }

    public static void Subset(String ans, String s, int idx) {
        if(idx==s.length()){
            System.out.print(ans+"  ");
            return ;
        }
        char ch = s.charAt(idx);
        Subset(ans+ch,s,idx+1);
        Subset(ans,s,idx+1);
    }

}
