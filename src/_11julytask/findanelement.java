package _11julytask;

import java.util.ArrayList;

import java.util.Locale;
import java.util.Scanner;

public class findanelement {
    public static void main(String[] args) {

        ArrayList d = new ArrayList<>();

        d.add("Mumbai");
        d.add("delhi");
        d.add("pune");

        Scanner scanner =new Scanner(System.in);

        System.out.println("city you want to check");

        String s = scanner.next().toLowerCase();


        if(d.contains(s)){

            System.out.println("yes " + s + " is in the list");


        }

        else{

            System.out.println("sorry "+ s +" is not in the list");

        }





    }
}
