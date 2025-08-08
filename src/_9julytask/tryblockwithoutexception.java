package _9julytask;

public class tryblockwithoutexception {
    public static void main(String[] args) {
        int a = 100;
        int b;


        try{

            b= a/2;
            System.out.println(b);
        }

        catch(Exception e){


            System.out.println("fools");
        }

        finally{

            System.out.println("oh my god");
        }

    }
}
