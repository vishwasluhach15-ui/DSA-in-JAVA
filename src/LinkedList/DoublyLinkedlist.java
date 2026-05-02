package LinkedList;
class ListNode{
    int val ;
    ListNode next ;
    ListNode prev ;
    ListNode(int val){
        this.val = val ;
    }
}
class DLL{
    ListNode head ;
    ListNode tail ;
    int size  ;
    void insertAtHead(int x){
        ListNode temp = new ListNode(x) ;

        if(head== null )  head = tail = temp   ;
        else{
            temp.next = head ;
            temp.prev = null;
            head = temp ;
        }
        size++ ;

    }
    void insertAtTail(int x ){
        ListNode temp = new ListNode(x) ;
        if(head == null )  head = tail = temp   ;
        else{
            tail.next = temp ;
            temp.prev = tail ;
            tail = temp ;
        }
        size++ ;
    }
    void deleteAtHead(){
        if(head == null ) return ;
        if(size == 1 ) head = tail = null ;
        else{
            head = head.next ;
            head.prev = null ;
        }
        size-- ;
    }
    void deleteAtTail(){
        if(head == null ) return ;
        if(size == 1 ) head = tail = null ;
        else{
            tail = tail.prev ;
            tail.next = null ;

        }
        size-- ;

    }
    void print(){
        ListNode temp = head ;
        while(temp != null ){
            System.out.print(temp.val+" ");
            temp = temp.next ;
        }
        System.out.println();
    }
    void displayrev(){
        ListNode temp = tail ;
        while(temp != null ){
            System.out.print(temp.val+" ");
            temp = temp.prev ;
        }
        System.out.println();
    }
    void insertAtIdx(int idx , int val){
        if(idx == 0 ) {
            insertAtHead(val);
            size++;
            return ;
        }
        if(idx == size){
            insertAtTail(val);
            size++ ;
            return ;
        }
        if(idx > size) { return ;
        }
        else{
            ListNode ii = new ListNode(val);
            ListNode temp = head ;
            for(int i = 0 ; i < idx - 1  ; i++ ){
                temp = temp.next ;
            }
            temp.next.prev = ii ;
            ii.next = temp.next;
            ii.prev = temp ;
            temp.next = ii ;
            size++ ;

        }


    }
    void deleteAtIdx(int idx ){
        if(idx == 0 ) {
            deleteAtHead();
            size -- ;
            return ;
        }
        if(idx == size){
            deleteAtTail();
            size -- ;
            return ;
        }
        if(idx > size) { return ;
        }
        ListNode temp = head ;
        for(int i = 1 ; i<= idx-1 ; i++){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        temp.next.next.prev = temp ;
        size-- ;

    }




}
public class DoublyLinkedlist {
    public static void main(String[] args) {
        DLL a = new DLL() ;
        a.insertAtHead(12);
        a.insertAtTail(90);
        a.print();
        a.insertAtTail(100);
        a.insertAtHead(1);
        a.print();
        a.deleteAtTail();
        a.print();a.print();a.displayrev();
        System.out.println(a.size);
        a.insertAtIdx(2,56);
        a.print();
        a.deleteAtIdx(1);
        a.print();





    }
}
