package LinkedList;


public class DisplayList {
    public static void Display(node head){
        node temp = head ;
        while(temp  != null){
            System.out.print(temp.val+" ");
            temp = temp.next ;

        }
    }
    public static void recDisplay(node head ){
        node temp = head ;
        if(temp == null) return ;
        System.out.print(temp.val+" ");
        recDisplay(temp.next);
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);
        node g = new node(12);
        // now connecting them
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;
        f.next = g ;
        recDisplay(a);


    }
}
