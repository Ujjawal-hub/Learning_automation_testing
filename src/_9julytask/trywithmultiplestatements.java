package _9julytask;
import java.util.Scanner;
public class trywithmultiplestatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number ");

        int d = scanner.nextInt();

        try{

            int b = 100/d;


            System.out.println(b);

           int y = b*2;
            System.out.println(y);



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
