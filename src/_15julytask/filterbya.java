package _15julytask;


import java.util.HashMap;

public class filterbya {

    public static void main(String[] args) {

        HashMap<Integer,String> h =  new HashMap();

        h.put(101,"Anjali");
        h.put(102,"Dipak");
        h.put(103,"Aman");
        h.put(104,"Ravi");

        for(Integer s: h.keySet()){


            if( h.get(s).toLowerCase().startsWith("a")){

                System.out.println(s +" -> "+ h.get(s));
            }

        }

    }
}
