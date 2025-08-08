package _9julytask;
import java.util.Scanner;
public class multiplecatchblock {
    public static void main(String[] args) {

        int [] a = {3,0,7,0,8,10};

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the index of an array");
        Integer b = scanner.nextInt();



        try {
            int f =100/a[b];
            System.out.println(f);
        }

        catch(ArithmeticException e){

            System.out.println(e.getMessage());

        }

        catch(ArrayIndexOutOfBoundsException g){

            System.out.println(g.getMessage());

        }

    }
}
