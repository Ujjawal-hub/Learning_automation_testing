package array;

import java.util.Scanner;

public class starpattern {

    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

        System.out.println("enter the height of the triangle");

        int b =a.nextInt();

        int c=b-1;

        int odd =1;

        for(int i=0;i<b;i++){

            for(int j=c;j>0;j--){

                System.out.print(" ");


            }

            for(int k=1;k<=odd;k++){

                System.out.print("*");

            }
            --c;
            odd = odd+2;

            System.out.println();

        }

    }










}
