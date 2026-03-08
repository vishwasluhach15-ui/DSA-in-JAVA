package OOPS;
class ArrayList{
    int[] arr ;
    int idx = 0 ;
    int size = 0 ;
    void add(int ele){
        if(idx == arr.length){// means array is full now make it larger
           CapacityIncrease();
        }
        arr[idx++]= ele ;
        size++;
    };
    void CapacityIncrease(){
        int[] arr2 = new int[arr.length*2 ];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];

        }
        arr = arr2 ;
    }
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    int capacity(){
        return arr.length;
    }
    int get(int x){
        return arr[x];
    }
    void display(){
        for (int i = 0; i < size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void set(int idx , int ele ){
        arr[idx] = ele ;
    }

}
public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(3);
        System.out.println(arr.capacity());
        arr.add(10); arr.add(20);arr.add(30);
        System.out.println(arr.get(1));
        arr.display();
        arr.add(60 ); arr.add(90);
        arr.display();
        arr.set(4,34);
        arr.display();
        System.out.println(arr.get(4));
    }
}
