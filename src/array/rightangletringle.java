package array;
import java.util.Scanner;
public class rightangletringle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the height of the traingle");

        int a = scanner.nextInt();


        for(int i=1;i<=a;i++){

            for(int j =0;j<i;j++) {

                System.out.print("*");
            }
            System.out.println();
        }



    }
}
