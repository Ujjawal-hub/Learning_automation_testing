package _3july_task;

public class addtwonumber {


    public static void main(String[] args) {

        calculator d = new calculator();
        System.out.println( d.add(3,4));
        System.out.println(d.add(6.3,3.2));
    }

}

class calculator{

    int add(int a,int b){

        return a+b;

    }

double add(double c ,double d){

        return c+d;

}


}