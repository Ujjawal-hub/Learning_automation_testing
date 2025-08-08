package _9julytask;
import java.util.Scanner;
public class nestedtrycatch {
    public static void main(String[] args) {

        int [] b = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };

         Scanner scanner = new Scanner(System.in);
        int c= scanner.nextInt();



        try {

            int a = 100/c;


         try {

           int t =  b[a];

             System.out.println(t);
         } catch (ArrayIndexOutOfBoundsException k) {

             System.out.println(k.getMessage());
         }
        }

        catch(ArithmeticException e){

            System.out.println(e.getMessage());

        }

    }
}
