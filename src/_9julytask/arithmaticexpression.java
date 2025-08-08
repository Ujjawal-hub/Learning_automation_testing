package _9julytask;

import java.util.Scanner;


public class arithmaticexpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer a;

        try {

            Integer b = scanner.nextInt();

             a = 2 / b;

            System.out.println(a);
        }catch (ArithmeticException e) {

            System.out.println("  div by zero not allowed ");
        }

    }
}
