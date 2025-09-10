package _15julytask;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class groupbylength {

  static HashMap<Integer,ArrayList>Groupbylenths(String scan) {

        String[] s = scan.split(" ");
        HashMap<Integer, ArrayList> h = new HashMap();
        for (String d : s) {

                if (!h.containsKey(d.length())) {

                        h.put(d.length(), new ArrayList());


                }
                h.get(d.length()).add(d);


        }

        return h;

}


        public static void main(String[] args) {
                System.out.println("enter the input");
        Scanner scanner = new Scanner(System.in);



                System.out.println(Groupbylenths(scanner.nextLine()));




        }





}