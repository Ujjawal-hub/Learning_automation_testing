package _15julytask;
import java.util.HashMap;
import java.util.Iterator;
public class _3waysiterate {
    public static void main(String[] args) {

        HashMap<String,String> testor = new HashMap();
        testor.put("Name","Dipak");
        testor.put("role","testor");
        testor.put("level","senior");

        for (Object o : testor.entrySet()){

            System.out.println(o);

        }

        System.out.println();
 for (String s : testor.keySet()){

     System.out.println( s +  "->"+  testor.get(s));

 }
        System.out.println();

 Iterator e = testor.entrySet().iterator();

 while(e.hasNext()){

     System.out.println(e.next());

 }



    }
}
