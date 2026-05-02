package Stacks;
class node{
    int val ;
    node next ;
    node(int val){
        this.val = val ;
    }
}
class MyStack{
    node head ;
    int size ;
    int peek(){
        return head.val ;
    }
    void push(int x){
        node temp= new node(x);
        if(size==0 ) head = temp ;

        else {
            temp.next = head;
            head = temp;

        }
        size++;
    }
    int pop(){

        node temp = head ;
        head = head.next ;
        size-- ;
        return temp.val ;

    }
    void display(){
        node temp = head ;
        while(temp != null ){
            System.out.println(temp.val);
            temp = temp.next ;
        }
        System.out.println();
    }

}
public class StackByLL {
    public static void main(String[] args) {
        MyStack ss = new MyStack() ;
        ss.push(45);
        ss.push(89);
        ss.push(89) ;
        ss.push(12);
//        System.out.println(ss.pop());
//        System.out.println(ss.pop());
        System.out.println(ss.size);
        ss.display();
//        System.out.println(ss.pop());

    }
}
