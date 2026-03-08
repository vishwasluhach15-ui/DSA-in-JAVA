package OOPS;
class Car1{
    int torque ;
    double price;
    String name ;
    void print(){
        System.out.println("Torque->"+torque+"HP  Price->"+price+"/-only  Car name->"+name+" ");
    }
}
public class PassByReference {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.name="Thar";
        c1.price=1000000;
        c1.torque= 200 ;
        c1.print();
    }
}
