package array;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int Size_of_the_Table = scanner.nextInt();

        for (int i = 0; i < Size_of_the_Table ; i++) {
            for (int j = 0; j < Size_of_the_Table; j++) {
                System.out.print(i*j+" | ");
            }
            System.out.println();
        }





    }
}
