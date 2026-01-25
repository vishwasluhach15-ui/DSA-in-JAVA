package ifelse;

import java.util.Scanner;

public class findquadrant {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any points : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0){
            System.out.println("("+x+","+y+") Lies in 1st Quadrant ");
        } else if (x<0 && y>0) {
            System.out.println("("+x+","+y+") Lies in 2nd Quadrant ");
        } else if (x<0 && y<0) {
            System.out.println("("+x+","+y+") Lies in 3rd Quadrant ");
        } else if(x > 0 && y < 0){
            System.out.println("("+x+","+y+") Lies in 4th Quadrant ");
        }else{
            System.out.println("Do not lies in Quadrant may be on number line or origin");
        }
    }
}
