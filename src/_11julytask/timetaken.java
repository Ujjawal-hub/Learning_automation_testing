package _11julytask;

import java.util.ArrayList;
import java.util.LinkedList;

public class timetaken {

    public static void main(String[] args) {


        long arrayliststarttime = System.currentTimeMillis();

        ArrayList r = new ArrayList();

        for (long i = 0; i < 10000; i++) {

            r.add(i);


        }

        long arraylistendtime = System.currentTimeMillis();

        System.out.println("time taken in array list = " + (arraylistendtime-arrayliststarttime));




        long linkedliststarttime = System.currentTimeMillis();

        LinkedList y = new LinkedList<>();


        for(long i = 0 ;i<10000;i++ ){

            y.add(i);


        }

        long linkedlistendtime = System.currentTimeMillis();


        System.out.println("time taken by linked list "+ (linkedlistendtime-linkedliststarttime));

    }

}
