package _15julytask;
import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class firstcharcataer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the string input");

        char[] s = scanner.nextLine().toCharArray();

        LinkedHashMap<Character,Integer> l = new LinkedHashMap();

        for(char g : s){

            l.put(g,l.getOrDefault(g,0)+1);

        }

        System.out.println(l);

        for(Character h : l.keySet()){

            if(l.get(h)==1){

                System.out.println("first single character is-> " + h);
                break;
            }

        }

    }

}
