package _15julytask;
import java.util.Scanner;
import java.util.HashMap;
public class wordfrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the input");

        String s = scanner.nextLine();
        String[] e = s.split(" ");

        HashMap<String,Integer> h = new HashMap();

        for(String t : e){

            h.put(t,h.getOrDefault(t,0)+1);

        }

        System.out.println(h.entrySet());
    }
}
