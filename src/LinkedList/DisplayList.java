package LinkedList;

class Nodes{
    int val ;
    Nodes Next ;
    Nodes(int val){
        this.val = val ;
    }
}
public class DisplayList {
    public static void Display(Nodes head){
        Nodes temp = head ;
        while(temp  != null){
            System.out.print(temp.val+" ");
            temp = temp.Next ;

        }
    }
    public static void main(String[] args) {
        Nodes a = new Nodes(10);
        Nodes b = new Nodes(20);
        Nodes c = new Nodes(30);
        Nodes d = new Nodes(40);
        Nodes e = new Nodes(50);
        Nodes f = new Nodes(60);
        Nodes g = new Nodes(12);
        // now connecting them
        a.Next = b ;
        b.Next = c ;
        c.Next = d ;
        d.Next = e ;
        e.Next = f ;
        f.Next = g ;
        Display(a);


    }
}
