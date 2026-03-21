package LinkedList;
class node{
    int val ;
    node next ;
    node(int val ){
        this.val = val ;
    }
}

class linkedlist{
    node head ;
    node tail ;
    int size = 0 ;
    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
    }
    void AddAtTail(int val ){
        node temp = new node(val);
        if(head== null)head = tail = temp ;
        tail.next = temp ;
        tail = temp  ;
        size++;
    }
    void AddAtStart(int val ){
        node temp = new node(val );
        temp.next = head ;
        head = temp ;
        size++;
    }
    void insert(int idx , int val ){
        node temp = head ;
        for(int i = 1 ; i<idx-1 ; i++){
            temp = temp.next ;
        }
        node t = new node(val);
        t.next = temp.next ;
        temp.next = t ;
        size++ ;
    }
    void DeleteAtHead(){
        if(head ==null){
            System.out.println("List Empty ");
            return ;
        }
        head= head.next ;
        size-- ;
        if(head==null)head= tail;
    }
//    void DeleteAtHead(){
//        if(head == null){
//            System.out.println("List Empty");
//            return;
//        }
//        head = head.next;   // move head forward
//        size--;
//    }

    int get(int idx ){
        node temp = head ;
        for (int i = 1 ; i < idx ; i++) {
            temp = temp.next ;
        }
        return temp.val ;
    }
    void DeleteAtIdx(int idx ){
        node temp = head ;
        if(idx==0){DeleteAtHead();return;}
        for(int i = 1 ; i< idx-1 ; i++){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        if(idx == size-1) tail = temp ;
        size-- ;
    }
}

public class LinkedListDataStructure {

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
//        ll.display();
//        System.out.println();
        ll.AddAtTail(77);
        ll.AddAtStart(10);
        ll.AddAtStart(20);
        ll.AddAtStart(30);
        ll.AddAtStart(40);
        ll.AddAtTail(0);
        ll.AddAtTail(-10);
        ll.AddAtTail(-20);
        ll.AddAtTail(-30);
        ll.display();
        System.out.println();
        ll.insert(3,80);
        ll.display();
        System.out.println();
        ll.DeleteAtHead();
        ll.display();
        System.out.println();
        ll.DeleteAtIdx(2);
        ll.display();
        System.out.println();
        System.out.println(ll.get(6));
//        System.out.println();
        ll.display();
        System.out.println();
//        ll.DeleteAtLast();
        ll.display();





//        ll.InsertAtPos(3,59);
//        ll.Display();
//        System.out.println();
//        System.out.println(ll.get(5));


    }
}
