package OOPS;
class ComplexNumber{
    int x ;
    int y ;
    ComplexNumber(){};
    ComplexNumber(int x , int y ){
        this.x = x ;
        this.y = y ;
    }
    void print(){
        if(y>=0) System.out.println(x+" + i"+y);
        else System.out.println(x+" - "+(-y)+"i");
    }
    void sum(ComplexNumber z){
        this.x+= z.x;
        this.y+=z.y;
    }
    void multiply(ComplexNumber z){
        int real  = (x*z.x)-(y*z.y);
        int fake  = (x*z.y)+(y*z.x);
        x = real ;
        y = fake ;
    }
    void Divide(ComplexNumber z){
        int real = (x*z.x + z.y*y)/(z.x*z.x+z.y*z.y);
        int img = (y*z.x - x*z.y)/(z.x*z.x+z.y*z.y);
        x = real ;
        y = img ;
    }
}
public class ComplexNum {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(20,-4);
        ComplexNumber b = new ComplexNumber(3,2);
//        System.out.println("Complex Numbers are :  ");
//        a.print();b.print();
//        System.out.println("After adding a+=b : ");
//        a.sum(b);
//        a.print();b.print();
//        System.out.println("Multiplying b*=a : ");
//        b.multiply(a);
        a.print();b.print();
        System.out.println("After division a/=b:  ");
        a.Divide(b);
        a.print();b.print();

    }
}
