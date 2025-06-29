package array;

import java.util.Scanner;

public class lefthandtriangle {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("enter the height of the triangle");

        int b = a.nextInt();

        for (int i = b; i > 0; i--) {

            for (int j = i; j > 0; j--) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
