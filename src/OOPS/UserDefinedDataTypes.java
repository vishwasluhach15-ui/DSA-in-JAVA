package OOPS;

class Student{
     int roll ;
     String name ;
     double cgpa ;
}
public class UserDefinedDataTypes {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vishwas ";
        s1.roll = 24 ;
        s1.cgpa = 8.9 ;
        System.out.println(s1.cgpa);
    }
}
