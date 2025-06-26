package if_else_practice;

import java.util.Scanner;

public class checking_vowles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the character");

        char a = scanner.next().toLowerCase().charAt(0);

        if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            System.out.println("it is a vowel");
        }
        else{
            System.out.println("it is not a vowel");
        }

    }


}
