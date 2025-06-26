package loop_practice;

import java.util.Scanner;

public class loop_factorial {

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner factorial = new Scanner(System.in);


        long a = 1l;
        if(!factorial.hasNextInt()){
            System.out.println("eneter the integer");
            return;
        }


else {
            long d = factorial.nextInt();

            if (d < 0) {
                System.out.println("enter the positive integer");
                return;
            }

            else if(d == 0) {
                    System.out.println("your answer is = 1");
                    return;
                }

        else{




                for (; d > 1; d--) {

                    a = a * d;
                }

            }

            System.out.println("your answer is " + a);


        }

    }




}
