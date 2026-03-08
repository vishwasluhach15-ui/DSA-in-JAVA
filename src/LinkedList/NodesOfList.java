package LinkedList;


public class NodesOfList {
    public static void main(String[] args) {
        Nodes a = new Nodes(10);// 10 20 30 40 50
        Nodes b = new Nodes(20);
        Nodes c = new Nodes(30);
        Nodes d = new Nodes(40);
        Nodes e = new Nodes(50);
        // now connect them
        a.Next = b ;
        b.Next = c ;
        c.Next = d ;
        d.Next = e ;
        System.out.println(a.val);

        System.out.println(a.Next);
        System.out.println(a.Next.Next);

    }
}
