package _15julytask;
import java.util.HashMap;
import java.util.TreeMap;

public class sortbykeys {

    public static void main(String[] args) {

        HashMap<String,Integer> h = new HashMap();
h.put("Ravi",80);
h.put("Anjali",95);
h.put("Diapk",75);

        System.out.println(h);
        System.out.println();
        System.out.println();
TreeMap<String,Integer> r = new TreeMap();

for(String i : h.keySet()){

    r.put(i,h.get(i));
}

        System.out.println(r);
    }
}
