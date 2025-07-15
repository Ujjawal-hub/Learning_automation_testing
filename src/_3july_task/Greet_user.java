package _3july_task;

public class Greet_user {
    public static void main(String[] args) {
    Greeter y = new Greeter();
    y.greet();
    y.greet("ujjawal");
    }
}
class Greeter{

    void greet(){

        System.out.println("hello");
    }
    void greet(String g){

        System.out.println("hello " + g);
    }


}