package _3july_task;

public class vechilestart {
    public static void main(String[] args) {

        Vechile a = new Vechile();
        Vechile b = new bike();
        Vechile c = new car();

        a.start();
        b.start();
        c.start();

    }
}
class Vechile{

    void start(){
        System.out.println("vroom");

    }

}

class bike extends Vechile {
    void start() {
        System.out.println("kick start the bike");

    }
}

class car extends Vechile{

    void start(){
        System.out.println("turn the key to start");
    }
}