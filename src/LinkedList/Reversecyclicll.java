package LinkedList;
//import LinkedList.* ;
public class Reversecyclicll {
    public static void main(String[] args) {
        node head = new node(10 );
        node a = new node(20) ;
        node c = new node(30 );
        node d = new node(40) ;
        node e = new node(50 );
        node h = new node(60) ;
        node f = new node(70 );
        node g = new node(80) ;
        head.next = a ;
        a.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = h ;
        h.next = f ;
        f.next = g ;
        g.next = head ;


        node temp = head ;
        while(temp.next != head ){
            temp = temp.next ;
        }
        temp.next = null ;
        reverse(head) ;

        head.next = temp ;
        node temp1 = temp ;
        while(temp1.next != temp ){
            System.out.println(temp1.val+" ");
            temp1 = temp1.next ;
        }
        System.out.println(temp1.val);




    }
    static void reverse(node head ){
        node pre = null ;
        node crr = head ;
        node fwd = null ;
        while(crr != null){
            fwd = crr.next ;
            crr.next = pre ;
            pre = crr ;
            crr= fwd ;
        }

    }
}
