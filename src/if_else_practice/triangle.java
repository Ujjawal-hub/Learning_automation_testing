package if_else_practice;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("enter first side");
        Scanner sidea = new Scanner(System.in);
        int side1 = sidea.nextInt();
        System.out.println("enter second side");
        int side2 = sidea.nextInt();
        System.out.println("enter third side");
        int side3 = sidea.nextInt();

        if (side1== side2 && side3==side2 && side1 == side3){
            System.out.println("this is a equilateral triangle");
        } else if (side1== side2 || side2 == side3 || side1 == side3) {
            System.out.println("this is an isosceles triangle");

        }
        else{
            System.out.println("this is a scalene triangle");
        }

    }

}
