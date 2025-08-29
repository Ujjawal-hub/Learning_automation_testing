package _11julytask;
import java.util.ArrayList;
import java.util.List;

public class adddisplayelement {
    public static void main(String[] args) {

        ArrayList  r = new ArrayList();

        r.add("Dipak");
        r.add("ravi");
        r.add("sneha");
        r.add("priya");
        r.add("anjali");

        for(int i=0 ; i< r.size();i++){

            System.out.println(r.get(i));

        }

    }
}
