package LinkedList;

public class Removeduplicate {
    void rd2(node head ){
        node d = new node(-1);
        d.next = head ;
        node temp = d ;
        node i = head ;
        while( i != null){
            if(i.next == null || i.val != i.next.val){
                temp.next = i ;
                temp = i ;
                i = i.next ;
            }
            else{
                node j = i ;
                while(j != null && j.val == i.val){
                    j =j.next ;
                }
                i = i.next ;
            }
            d = d.next ;
            while(d != null ){
                System.out.print(d.val+"  ");
                d = d.next;
            }

        }
    }
    public static void main(String[] args) {
        node head = new node(10 );
        node a = new node(10 );
        node b = new node(12 );
        node c = new node(22 );
        node d = new node(22 );
        node e = new node(30 );
        node f = new node(30 );
        node g = new node(40 );
        node h = new node(40 );
        node r = new node(40 );
        head.next= a; a.next = b ; b.next = c ;c.next = d ;
        d.next = e ; e.next = f;
        f.next = g ;g.next = h ;
        h.next = r ;r.next = null ;
        node i = head ;
        node j = head ;
        while( j != null ){
            if(i.val == j.val ){
                j = j.next ;
            }
            else{
                i.next = j ;
                i = j ;
            }
            i.next = j ; 
        }
        while(head != null ){
            System.out.print(head.val+"  " );
            head = head.next ;
        }
    }
}
