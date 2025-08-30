package _11julytask;

import java.util.LinkedList;
import java.util.ListIterator;
public class revesealinkedlist {
    public static void main(String[] args) {

        LinkedList o =  new LinkedList<>();
        LinkedList t = new LinkedList<>();

        o.add(10);
        o.add(20);
        o.add(30);
        o.add(40);
        System.out.println(o);

        ListIterator r = o.listIterator(o.size());

        while(r.hasPrevious()){

            t.add(r.previous());


        }


        System.out.println(t);




    }
}
