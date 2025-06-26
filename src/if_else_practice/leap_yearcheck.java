package if_else_practice;


import java.util.Scanner;


public class leap_yearcheck {


    public static void main(String[] args){



        Scanner scanner = new Scanner(System.in);

        System.out.print("eneter the year\n");

        int  year = scanner.nextInt();

        if (year%4==0) {
            System.out.print("this is a leap year");
        }
        else{
            System.out.print("this not a leap year");


        }


    }

}
