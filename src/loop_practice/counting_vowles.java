package loop_practice;

import java.util.Scanner;

public class counting_vowles {

    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);

        System.out.println("enter the word");

        String a = word.next().toLowerCase();

        int b = a.length();

        int d = 0;

        int u = 0;

        for(int i=0;i<b;i++){
           char c = a.charAt(i);


           switch(c){

               case 'a','i','e','o','u' : d++;
                        break;

               default : u++;

           }


        }

        System.out.printf("number of vowels %d  and consonants are %d", d,u );




    }
}
