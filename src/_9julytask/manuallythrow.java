package _9julytask;
import java.util.Scanner;



public class manuallythrow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the valid  natural number number ");

        int d = scanner.nextInt();
try {
    if (d == 0) {

        throw new ArithmeticException("this is not a natural number");
    }

} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}


            System.out.println("good job");


    }
}
