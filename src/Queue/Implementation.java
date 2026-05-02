package Queue;


class node{
    int val ;
    node next ;
    node(int val  ){
        this.val = val ;

    }
}
class Que{
    node head ;
    node tail ;
    int size = 0 ;
    public void add(int val ){
        node temp = new node(val) ;
        if(size==0){
            head = tail = temp ;

        }
        else {
            tail.next = temp;
            tail = temp;

        }
        size++;

    }
    public int remove(){
        if(size==0) {
            System.out.println("Empty");
        }
        else{
            node temp = head ;
            head = head.next ;
            size-- ;
            return temp.val ;

        }
        return 0 ;
    }
    public void display(){
        node temp = head ;
        for(int i = 0 ; i< size ; i++){
            System.out.print(temp.val+" ");
            temp= temp.next ;
        }
        System.out.println();
    }


}
public class Implementation {
    public static void main(String[] args) {
        Que q = new Que ();
        q.add(50);
        q.add(40);
        q.add(90);
        q.display();
        System.out.println(q.size);
        int j = q.remove();
        System.out.println(q.remove());
        q.display();

    }
}
