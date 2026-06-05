package BinaryTrees;
import java.util.* ;
class node{
    int val ;
    node left ;
    node right ;
    node(int val){
        this.val = val ;
    }
}
class pair{
    node Node ;
    int level ;
    pair(node Node , int level ){
        this.Node = Node ;
        this.level= level ;

    }
}
public class Implementation {
    public static void main(String[] args) {
//          4
//        /   \
//       3      5
//      /  \   /  \
//    -3   -9 8   -8

//        this is pew order

        node a = new node(4);
        node b = new node(3);node e = new node(-8);
        node c = new node(5);node f = new node(8);
        node d = new node(-3);node g = new node(-9);
        a.left=b;a.right= c ;
        b.left = d ; b.right = g ;
        c.left = f ; c.right = e ;
        d.left = null ; d.right = null ;
        g.left = null ; g.right = null ;
        f.left = null ; f.right = null ;
        e.left = null ; e.right = null ;
//        levels(a);
//        level_order_linewise(a);
//        level_order(a);
//        for(int i = 0 ; i< levels(a));
//        int x = 2 ; int level ;
//        klevel(a,x,level= 0);

//        preorder(a);
//        System.out.println();
//        inorder(a);
//        System.out.println();
//        postorder(a);
//        System.out.println();
//        System.out.println();
//        System.out.println(size(a));
//        System.out.println(sum(a));
    }

//    private static int levels(node root) {
//
//    }

    private static void klevel(node root ,int x , int level ){
        if(root == null ) return ;
        if(x== level) System.out.print(root.val+" ");
        klevel(root.left,x,level+1);
        klevel(root.right,x,level+1);

    }

    private static void level_order_linewise(node root) {
        pair p = new pair(root, 0);
        Queue<pair> q = new LinkedList<>() ;
        q.add(p);
        int crr = 0 ;

        while(q.size() > 0 ){
            pair front = q.remove() ;
            node Node = front.Node ;
            int level = front.level ;

            if(front.level == crr ){
                crr++ ;
                System.out.println();
            }
            System.out.print(front.Node.val+" ");
            if(Node.left != null ) q.add(new pair(Node.left,level+1));
            if(Node.right != null ) q.add(new pair(Node.right, level+1));

        }
        System.out.println();
    }

    private static void level_order(node root) {
        Queue<node> q = new LinkedList<>();
        q.add( root) ;
        while(q.size()>0){
            node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left != null ) q.add(front.left);
            if(front.right != null ) q.add(front.right);

        }
    }

    private static void postorder(node root) {
        if(root== null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");

    }

    private static void inorder(node root) {
        if(root== null) return ;
        postorder(root.left);
        System.out.print(root.val+" ");
        postorder(root.right);

    }

    private static int sum(node root) {
        return root== null ?0: root.val+ sum(root.left)+ sum(root.right);
    }

    private static int  size(node root) {
//        if(root == null ){
//            return 0 ;
//        }
//        return (1 + size(root.right) + size(root.left));
        return root == null ? 0 : 1 + size(root.left)+ size(root.right);
    }

//    private static void preorder(node root) {
//        if(root == null )return ;
//        System.out.print(root.val+" ");
//
//        preorder(root.left);// all left values ko print karva dega
//        preorder(root.right); // all right value ko print karega
////        System.out.println();
//
//
//    }
}
