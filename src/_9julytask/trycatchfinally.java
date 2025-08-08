package _9julytask;

public class trycatchfinally {

    public static void main(String[] args) {

        try {

            int a = 10/0;
        }

        catch(ArrayIndexOutOfBoundsException e ){

            System.out.println(e.getMessage());

        }

        finally{

            System.out.println("write catch block correctly");
        }
    }
}
