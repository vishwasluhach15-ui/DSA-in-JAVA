package OOPS;
class Car{
    double length ;
    String name ;
    int seat ;
    Car(double x , String s , int n ){
        length = x ;
        name = s;
        seat = n ;
    }
    void print(){
        System.out.println(name+"  "+length+"  "+seat);
    }

}
public class Constructors {
    public static void main(String[] args) {
        Car c1 = new Car(3.4 ,"Kia Sonet",5);
        c1.print();
    }
}
