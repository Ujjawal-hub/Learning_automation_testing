package loop_practice;
import java.util.Scanner;
public class reverse_character {

    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);

        System.out.println("enter the word");

        String a = word.next();

        int b = a.length();

        String rev = "";

        for(int i = b-1 ;i>=0;i-- ){

             rev = rev +a.charAt(i);

        }

        if(a.equals(rev)){

            System.out.println("this is a plaindrome");
        }

        else{

            System.out.println("this is not a palindrome");
        }


    }



}
