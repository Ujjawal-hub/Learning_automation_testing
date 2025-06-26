package loop_practice;

import java.util.Random;
import java.util.Scanner;

public class guess_the_number_game {

    public static void main(String[] args) {

        Random r = new Random();

        int a = r.nextInt(101);

        System.out.println("enter the number");

        Scanner scanner = new Scanner(System.in);



        for(int i = 1;true;i++) {
            System.out.println("attemp number = " +i);

            if(!scanner.hasNextInt()){
                System.out.println("enter the integer");
                scanner.next();
                continue;
            }

            int number = scanner.nextInt();


            if(number<a){
                System.out.println("it is low");
                System.out.println("enter the next number");
            } else if (number>a) {

                System.out.println("number is high");
                System.out.println("enter the next number");

            }
            else{
                System.out.println("correct answer");
                break;
            }
        }



    }
}
