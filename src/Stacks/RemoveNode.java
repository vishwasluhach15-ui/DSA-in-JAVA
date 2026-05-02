//package Stacks;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//class ListNode{
//    int val ;
//    ListNode next ;
//    ListNode(int val){
//        this.val = val ;
//    }
//}
//public class RemoveNode {
//    public static void main(String[] args) {
//        publListNode removeNodes(ListNode head){
//            Stack<ListNode> ss = new Stack<>();
//            ListNode temp = head  ;
//            while(temp != null ){
//                while(ss.size()!=0 && temp.val > ss.peek().val){
//                    ss.pop();
//                }
//                ss.push(temp);
//            }
//            while(ss.size() > 0 ){
//                ListNode top = ss.pop();
//                temp = top  ;
//            }
//            return temp ;
//        }
//
//    }
//}
