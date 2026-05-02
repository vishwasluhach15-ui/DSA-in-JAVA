package Stacks;

import java.util.Stack;

public class StackBasics {
    public static Stack<String > AddAtBottomRec(Stack<String> ans, String x){
        if(ans.size()==0 ){
            ans.push(x);
            return ans ;
        }
        String top = ans.pop() ;
        AddAtBottomRec(ans,x);
        ans.push(top);
        return ans ;
    }
    public static Stack<String> AddAtBottom(Stack<String> ans, String x ){
        Stack<String> ab = new Stack<>();
        while(!ans.empty()){
            ab.push(ans.pop());
        }
        ans.push(x);
        while(!ab.empty()){
            ans.push(ab.pop());
        }
        return ans ;
    }
    public static  void reverse(Stack<String> st){
        if(st.size()<= 1) return ;
        String top = st.pop() ;
        reverse(st);
        AddAtBottomRec(st,top);
//        st.push(top);
    }
    public static void main(String[] args) {
        Stack<String> ss = new Stack<>() ;
        ss.push("Vikrant ") ;
        ss.push("Yogesh") ;
        ss.push("Vishwas") ;
        System.out.println(ss+"  "+ ss.size());
//        System.out.println(ss.peek());
//        System.out.println(ss.pop());System.out.println(ss.pop());
        Stack<String> s2 = new Stack<>() ;
        while(!ss.empty()){
            s2.push(ss.pop()) ;
        }
//        System.out.println(s2);
        Stack<String> rev = new Stack<>() ;
        while(!s2.empty()){
            rev.push(s2.pop());
        }
        while(!rev.empty()){
            ss.push(rev.pop());
        }
        System.out.println(ss);
        System.out.println(AddAtBottomRec(ss,"Kavya"));
        reverse(ss);
        System.out.println(ss);

    }
}
