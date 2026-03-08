package OOPS;

class Fractionnum{
    int num ;
    int den ;
    Fractionnum(int num , int den ){
        this.num = num ;
        this.den = den ;
        simplify();
    }
    Fractionnum(){};
    void print(){
        System.out.println(num+"/"+den);
    }
    void sum(Fractionnum f){
        num = f.den * num + den * f.num ;
        den = den* f.den ;
    }
    void multiply(Fractionnum f){
        num*= f.num ;
        den*= f.den ;
    }
    void simplify(){
        int gcd = hcf(num,den);
        num = num/gcd ;
        den = den/gcd ;
    }
    int hcf(int a , int b ){
        if(a==0)return b ;
        return hcf(b%a,a);
    }
}
public class Fraction {
    public static void main(String[] args) {
        Fractionnum a = new Fractionnum(3,5);
        Fractionnum b = new Fractionnum(6,8);
        a.print();b.print();
        System.out.print("Sum of a + b is : ");
        a.sum(b); a.print();
        System.out.print("Multiplication of (a+b)*b : ");
        b.multiply(a);
        b.print();

    }
}
