package _11julytask;

import java.util.LinkedList;

public class insertinmiddle {
    public static void main(String[] args) {


        LinkedList l = new LinkedList<>();

        l.add("apple");
        l.add("banana");
        l.add("mango");


        System.out.println(l);

        l.add(1,"orange");

        System.out.println(l);


    }
}
