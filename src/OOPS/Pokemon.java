package OOPS;

public class Pokemon {
    private static class Poke{
        int power ;
        String type ;
        Poke(int power , String type ){
            this.power= power ;
            this.type = type ;

        }
        void print(){
            System.out.println(power+" "+type);
        }

    }
    public static void main(String[] args) {

    }
}
