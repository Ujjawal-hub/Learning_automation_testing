package _9julytask;

public class nullcatch {
    public static void main(String[] args) {

        String s = null;

        try{

            System.out.println(s.length());
        }
        catch(NullPointerException h){

            System.out.println(h.getMessage());
        }
    }
}
