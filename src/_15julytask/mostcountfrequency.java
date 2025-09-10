package _15julytask;
import java.util.TreeMap;
import java.util.Scanner;

public class mostcountfrequency {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the input");
        TreeMap<Character,Integer> t = new TreeMap<>();
        TreeMap<Integer,Character> re  = new TreeMap<>();
       String s = scanner.nextLine();

        for (char c :s.toCharArray()) {

            t.put( c,t.getOrDefault(c,0)+1);


        }

for(Character o:t.keySet()){



    re.put(t.get(o),o);

}

        System.out.println(re.lastEntry());


    }
}
