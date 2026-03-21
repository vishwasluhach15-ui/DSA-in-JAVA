package LinkedList;


public class NodesOfList {
    public static void main(String[] args) {
        node a = new node(10);// 10 20 30 40 50
        node b= new node(20);
        node c = new node(30);// 10 20 30 40 50
        node d = new node(40);
        node e = new node(50);

        // now connect them
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        System.out.println(a.val);

        System.out.println(a.next);
        System.out.println(a.next.next);

    }
}
