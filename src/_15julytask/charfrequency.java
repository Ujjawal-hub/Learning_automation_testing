package _15julytask;

import java.util.Scanner;
import java.util.HashMap;

public class charfrequency {
    public static void main(String[] args) {
        System.out.println("enter the input");
        Scanner j = new Scanner(System.in);
       String p = j.nextLine();
       HashMap <Character,Integer> h  = new HashMap();
       for(char c : p.toCharArray()){

           h.put(c , h.getOrDefault(c,0)+1);


       }

        System.out.println(h.entrySet());
    }
}
